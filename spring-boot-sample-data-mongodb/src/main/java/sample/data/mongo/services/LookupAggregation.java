package sample.data.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.stereotype.Service;
import sample.data.mongo.models.Course;

@Service
public class LookupAggregation {

  @Autowired
  MongoTemplate mongoTemplate;

  public void LookupAggregationExample() {

    AggregationOperation unwind = Aggregation.unwind("studentIds");

    String query1 = "{$lookup: {from: 'student', let: { stuId: { $toObjectId: '$studentIds' } },"
        + "pipeline: [{$match: {$expr: { $eq: [ '$_id', '$$stuId' ] },},}, "
        + "{$project: {isSendTemplate: 1,openId: 1,stu_name: '$name',stu_id: '$_id',},},], "
        + "as: 'student',}, }";

    TypedAggregation<Course> aggregation = Aggregation.newAggregation(
        Course.class,
        unwind,
        new CustomAggregationOperation(query1)
    );

    AggregationResults<Course> results =
        mongoTemplate.aggregate(aggregation, Course.class);
    System.out.println(results.getMappedResults());
  }
}

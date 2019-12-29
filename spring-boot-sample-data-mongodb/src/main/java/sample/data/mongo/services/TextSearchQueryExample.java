package sample.data.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import sample.data.mongo.models.Campaign;
import sample.data.mongo.repository.CampaignRepository;

@Service
public class TextSearchQueryExample {

  @Autowired
  private CampaignRepository campaignRepository;

  //https://stackoverflow.com/questions/59467010/creating-a-repository-query-that-include-textcriteria-and-one-other-field
  public void getCampaignWithSearchQuery() {

//    Pageable pageable = new R

    Pageable pageable = PageRequest.of(0, 10, Direction.DESC, "startOn");

    String ownerId = "12";

    String keywords = "Krishna";

    Page<Campaign> campaignPage = campaignRepository.searchByByOwnerIdAndText(ownerId, keywords, pageable);

    for(Campaign campaign : campaignPage.getContent()) {
      System.out.println(campaign);
    }

  }
}

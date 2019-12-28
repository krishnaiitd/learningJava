package memory.interanlString;

import java.util.ArrayList;
import java.util.List;
import memory.escaping.references.Customer;

public class GCCheckList {

  public static void main(String[] args) {

    List<Customer> customers = new ArrayList<>();

    long index = 0l;
    while(true) {
      index++;
      Customer c = new Customer("ABC");
      customers.add(c);
      if (index > 100000 && index % 1000 == 0) {
        for(int i =0; i < 10 ; i++) {
          customers.remove(index - i);
        }
      }
    }
  }

}

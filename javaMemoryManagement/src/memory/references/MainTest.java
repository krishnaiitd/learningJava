package memory.references;

import java.util.Iterator;

public class MainTest {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        for (Customer next: records.getCustomers().values()) {
            System.out.println(next);
        }

        records.getCustomers().clear();

        for (Customer next: records.getCustomers().values()) {
            System.out.println(next);
        }

        // Return a copy of the object is not a eligant solutions


        // After implementing the Iterable class in Customer Records
        for (Object next: records) {
            System.out.println(next);
        }


    }
}

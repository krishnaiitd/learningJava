package memory.references;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable {

    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers() {

//        return this.records; // This is make empty of all records if someone make .clear on the
//        records anywhere.

//        return  new HashMap<String, Customer>(this.records); // This is make a copy of the object
        // records and return the pointers


        return Collections.unmodifiableMap(this.records);


    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }
}

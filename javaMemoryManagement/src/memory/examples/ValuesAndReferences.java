package memory.examples;

public class ValuesAndReferences {

    public static class Customer {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Customer(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue); // Alwayds passing the copy of the variable
        System.out.println(localValue);

        // For object
        // 1. Changes the attribute of object
        Customer c = new Customer("Sallay");
        renameCustomer(c);
        System.out.println(c.getName());
        // 2. Changes entire object in callee method, wouldn't reflect here.
        Customer c1 = new Customer("KP");
        System.out.println("Before method call " + c1.getName());
        changeCustomerObj(c1);
        System.out.println("After method call "  + c1.getName());

        // 3. Final keyword
        System.out.println("Final keyword");
        final Customer finalC = new Customer("Krishna");
        System.out.println(finalC.getName());
        // Even in the getName method we can change the value of name, java will not restrict on its
        // attributes unless final keyword used in its attributes.
        renameCustomer(finalC);
        System.out.println(finalC.getName());


    }

    private static void calculate(int calValue) {
        calValue = calValue*100;
    }

    private static void renameCustomer(Customer cust) {
        cust.setName("Diane");
    }

    private static void changeCustomerObj(Customer cust) {
        Customer newC1 = new Customer("PRASAD");
        cust = newC1;
        System.out.println("Name in the changeCustomerObj method: " + cust.getName());
    }

}

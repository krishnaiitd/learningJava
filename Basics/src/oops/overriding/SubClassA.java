package oops.overriding;


public class SubClassA extends superClassA {

    @Override
    public void methodA1() {
        System.out.println("In the class " + this.getClass().getName() + " method name: methodA1");
    }
}

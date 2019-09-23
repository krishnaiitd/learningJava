package oops.overriding;

public class superClassA {

    public void methodA1() {
        System.out.println("In the class " + this.getClass().getName() + " method name : methodA1");
    }

    public void methodA2() {
        System.out.println("In the class " + this.getClass().getName() + " method name methodA2");
        System.out.println("Calling the methodA1, where it will goes ??? in the child class or parent class ??");
        this.methodA1();

    }
}

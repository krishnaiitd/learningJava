package oops.Polymorphism;

public class PolymorphismExample {
//    public void addition () {
//        System.out.println("Assuming the super class of Polymorphism example");
//    }


    public static void main(String[] args) {
        SuperClassA superClassA = new SuperClassA();
        superClassA.add();
//        This call to super class add method


        SuperClassA superClassA1 = new SubClassOfA();
        superClassA1.add();
//        This call to sub-class add method i.e polymorphism applied here
//        and will not the parent class method add, so it overrides the super class method and is known as method overriding

//        Overriding happens if sub class method satisfies below conditions with the super class method
//        1. Method name should be same.
//        2. Argument should be same.
//        3. Return type also should be same.

//        Overloading
//        1. Same method name
//        2. Different Argument type.
//        3. May have different return types
//        Polymorphism is not applicable for method overloading


//        SubClassOfA subClassOfA = new SuperClassA();

        SubClassOfA subClassOfA = new SubClassOfA();
        subClassOfA.add();
    }
}





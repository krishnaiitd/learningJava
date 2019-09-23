package gsa;

import cisco.interfaceA;
import cisco.interfaceB;

public class TestInterface implements interfaceA, interfaceB {

    @Override
    public void testA(String name) {
        System.out.println("Hello world "+ name);
    }

    @Override
    public int methodA(int a) {
        return a * a;
    }

//    @Override
//    public double methodA(int a) {
//        return a * a;
//    }
//error: method methodA() is already defined in class TestInterface
//error: methodA() in TestInterface cannot implement methodA() in interffaceA

    @Override
    public double methodA(double a) {
        return a * a;
    }


    public static void main(String args[]) {
        TestInterface t = new TestInterface();
        t.testA("Hello");
        System.out.println(t.methodA(10));
        System.out.println(t.methodA(11.67));
    }
}

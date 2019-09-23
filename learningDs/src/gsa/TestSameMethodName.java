package gsa;

public class TestSameMethodName {
    public void methodA(int a) {
        System.out.println("method A with int args return type void");
    }

    public void methodA(double a) {
        System.out.println("Method A with doube args return type void");
    }

//    public int methodA(int a) {
//        System.out.println("Method A with args A and return type int ");
//    }
//     Due to Erasure we can't defined same name method with same signature and with different return type
//    Because both method have same Erasure


    public String methodA(String a) {
        System.out.println("Different args with different return type " +  a);
        return "Return value " + a;
    }

    public static void main(String args[]) {
        TestSameMethodName testSameMethodName = new TestSameMethodName();
        testSameMethodName.methodA(123);
        testSameMethodName.methodA(12.5643);
        String a = testSameMethodName.methodA(" value");
        System.out.println(a);
    }
 }

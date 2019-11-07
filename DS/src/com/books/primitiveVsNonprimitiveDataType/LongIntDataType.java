package com.books.primitiveVsNonprimitiveDataType;

public class LongIntDataType {

    public static void main(String args[]) {
        //System.out.println("Starting of longObjectTypeTest: " + System.nanoTime());
        long start = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            longObjectTypeTest longObjectTypeTest = new longObjectTypeTest(10l, 20l, "Testing");
        }
        //System.out.println("End of longObjectTypeTest: " + System.nanoTime());
        long longObjectTypeTestNanoSec = (System.nanoTime() - start);
        System.out.println("Total Time for longObjectTypeTest: " + longObjectTypeTestNanoSec);


        //System.out.println("Starting of longPrimitiveTypeTest: " + System.nanoTime());
        long start2 = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            longPrimitiveTypeTest longPrimitiveTypeTest = new longPrimitiveTypeTest(10l, 20l, "Testing");
        }
        //System.out.println("End of longPrimitiveTypeTest: " + System.nanoTime());
        long longPrimitiveTypeTestNanoSec = (System.nanoTime() - start2);
        System.out.println("Total Time for longPrimitiveTypeTest: " + longPrimitiveTypeTestNanoSec);

        System.out.println("Improved times : " + longObjectTypeTestNanoSec/longPrimitiveTypeTestNanoSec);

    }


    public static class longObjectTypeTest {
        private Long a;
        private Long b;
        private String c;

        public Long getA() {
            return a;
        }

        public void setA(Long a) {
            this.a = a;
        }

        public Long getB() {
            return b;
        }

        public void setB(Long b) {
            this.b = b;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }

        public longObjectTypeTest(Long a, Long b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static class longPrimitiveTypeTest {
        long a;
        long b;
        String c;

        public long getA() {
            return a;
        }

        public void setA(long a) {
            this.a = a;
        }

        public long getB() {
            return b;
        }

        public void setB(long b) {
            this.b = b;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }

        public longPrimitiveTypeTest(long a, long b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}

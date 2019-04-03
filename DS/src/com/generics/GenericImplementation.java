package com.generics;

public class GenericImplementation implements GenericInterface {

    // Not working
    @Override
    public Double genericMethod(Double t) {
        System.out.println("Trying to implement generic method with return T and method args T as well ");
        return t*4.3;
    }

}

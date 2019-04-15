package com.generics;

public class GenericImplementation implements GenericInterface<String> {

    @Override
    public String genericMethod(String o) {
        System.out.println("Implemented generic interface method, arguments: " + o.toString());
        return "Success";
    }
}

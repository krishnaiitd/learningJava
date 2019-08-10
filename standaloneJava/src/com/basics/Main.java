package com.basics;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) throws JSONException {
	// write your code here

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("abc", "Krishna");
        System.out.println(jsonObject.getString("abc"));

        System.out.println("Hello");

        Integer integer = 0;
        integer = 4;

        System.out.println("Value of integer is " +  integer);

        for (int i =0; i < 10; i++) {
            if (i < integer) {
                System.out.println("Less than 4");
            } else  {
                System.out.println("Greater than 4");
            }

            System.out.println("Current value of i is "  + i);

        }

        try {
            int j  = 10000/integer;
            System.out.println("value of j is" + j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

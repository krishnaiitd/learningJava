package com.ds;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        String cart = "[{\"size\":\"S\", \"id\":11},  {\"size\":\"8\", \"id\":19}]";

        Type type = new TypeToken<ArrayList<CObject>>() {
        }.getType();

        ArrayList<CObject> cObjectList = (new Gson()).fromJson(cart, type);

        System.out.println(cObjectList);

        System.out.println(cObjectList.size());
        
    }

    public class CObject {

        private String id;
        private String size;

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "CObject{" +
                "id='" + id + '\'' +
                ", size='" + size + '\'' +
                '}';
        }
    }
}

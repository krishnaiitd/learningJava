package com.ds.object.clone;

import java.lang.reflect.Type;

import com.google.gson.Gson;

public class deepClone {

	public static <T> T byGson(T object, Type classType) {
		Gson gson = new Gson();

		String objectString = gson.toJson(object);

		T toObject = gson.fromJson(objectString, classType);

		return toObject;

	}
}

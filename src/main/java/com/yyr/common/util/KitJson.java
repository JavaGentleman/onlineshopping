package com.yyr.common.util;

import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class KitJson {
	private static Gson gson = null;

	static {
		if (gson == null) {
			gson = new GsonBuilder().serializeNulls().create();
		}
	}

	public static String toJsonString(Object obj) {
		if (obj == null) {
			return "{}";

		}
		if (obj instanceof String) {
			if (StringUtils.isEmpty(obj.toString())) {
				return "{}";
			}
		}
		String json = "";
		try {
			if (gson != null) {
				json = gson.toJson(obj);
			}
		} catch (Exception e) {
			return "{}";
		}
		return json;
	}

	/**
	 * 转成bean
	 *
	 * @param json
	 * @return
	 */
	public static <T> T fromJsonString(String json, Class<T> classOfT) {
		T t = null;
		if (gson != null) {
			t = gson.fromJson(json, classOfT);
		}
		return t;
	}

	/**
	 * 转成list
	 *
	 * @param json
	 * @param cls
	 * @return
	 */
	public static <T> List<T> toList(String json, Class<T> cls) {
		List<T> list = null;
		if (gson != null) {
			list = gson.fromJson(json, new TypeToken<List<T>>() {
			}.getType());
		}
		return list;
	}

	/**
	 * 转成map的
	 *
	 * @param json
	 * @return
	 */
	public static <T> Map<String, T> toMap(String json) {
		Map<String, T> map = null;
		if (gson != null) {
			map = gson.fromJson(json, new TypeToken<Map<String, T>>() {
			}.getType());
		}
		return map;
	}

	public static <T> T parseMap2Object(Map<String, String> paramMap, Class<T> cls) {
		return JSONObject.parseObject(JSONObject.toJSONString(paramMap), cls);
	}

	/*public static String list2json(List<Category> list) {

		return gson.toJson(list);

	}*/

}

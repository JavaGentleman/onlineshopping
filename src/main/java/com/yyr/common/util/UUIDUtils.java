package com.yyr.common.util;

import java.util.UUID;

public class UUIDUtils {
	/**
	 * 随机生成id
	 * 
	 * @return
	 */
	public static String getId() {
		return UUID.randomUUID().toString().substring(0, 5);
	}

	public static void main(String[] args) {

		System.out.println("sdafsdfsdsdasdyyrsdfsdfr");
        System.out.println("sdafsdfsdsdasdyyrr2hww");
		System.out.println(getId());
	}
}

package com.yyr.common.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

	/**
	 * 设置
	 *
	 * @param response
	 * @param name
	 * @param value
	 * @param maxAge
	 */
	public static void set(HttpServletResponse response, String name, String value, int maxAge) {
		Cookie cookie = new Cookie(name, value);
		cookie.setPath("/");
		cookie.setMaxAge(maxAge);
		response.addCookie(cookie);
	}

	/**
	 * 取Cookie值
	 *
	 * @param request
	 * @param name
	 * @return
	 */
	/*public static Cookie get(HttpServletRequest request, String name) {
		Map<String, Cookie> cookieMap = readCookile(request);
		if (cookieMap.containsKey(name)) {
			return cookieMap.get(name);
		} else
			return null;
	}
*/
	/**
	 * 将cookile遍历转换为map集合
	 *
	 * @param request
	 * @return
	 */
/*	public static Map<String, Cookie> readCookile(HttpServletRequest request) {
		Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			throw new UserException(ResultEnum.USER_INFO_EMPTY);
		}
		for (Cookie cookie : cookies) {
			cookieMap.put(cookie.getName(), cookie);
		}
		return cookieMap;
	}*/
}

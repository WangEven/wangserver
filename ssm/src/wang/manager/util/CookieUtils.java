package wang.manager.util;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
 
	public static String EncodeCookie(String[] CookiesValues) {
		StringBuilder sb = new StringBuilder();
		for (String tempString : CookiesValues) {
			sb.append(tempString + "|");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	/*
	 * maxAge分钟
	 */
	public static void SetCookie(HttpServletResponse response,
			String CookieName, String CookieValue, int maxAge) {
		Cookie cok = new Cookie(CookieName, CookieValue);
		cok.setPath("/");
		if (maxAge > 0)
			cok.setMaxAge(maxAge * 60);
		response.addCookie(cok);
	}

	public static Cookie GetCookieByName(HttpServletRequest req,
			String CookieName) {
		Map<String, Cookie> cookieMap = ReadCookieMap(req);

		if (cookieMap.containsKey(CookieName)) {
			return cookieMap.get(CookieName);
		}
		return null;

	}

	private static Map<String, Cookie> ReadCookieMap(HttpServletRequest request) {
		Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();

		Cookie[] cookies = request.getCookies();
		if (null != cookies) {
			for (Cookie cok : cookies) {
				cookieMap.put(cok.getName(), cok);

			}
		}
		return cookieMap;
	}
}

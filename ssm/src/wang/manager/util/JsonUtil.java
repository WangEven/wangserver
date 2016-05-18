package wang.manager.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static ObjectMapper objectMapper = new ObjectMapper();

	public static ObjectMapper getInstance() {

		return objectMapper;
	}

	/**
	 * json to bean
	 * 
	 * */
	public static <T> T json2Bean(String jsonStr, Class<T> clazz)
			throws Exception {
		return objectMapper.readValue(jsonStr, clazz);
	}

	/**
	 * javaBean,list,array convert to json string
	 */
	public static String obj2Json(Object bean) throws Exception {
		return objectMapper.writeValueAsString(bean);
	}

	/**
	 * json string convert to map
	 */
	public static <T> Map<String, Object> json2map(String jsonStr)
			throws Exception {
		return objectMapper.readValue(jsonStr, Map.class);
	}

	/**
	 * 
	 * json string convert to map with javaBean
	 * 
	 * */
	public static <T> Map<String, T> json2BeanMap(String jsonStr, Class<T> clazz)
			throws Exception {
		Map<String, Map<String, Object>> map = objectMapper.readValue(jsonStr,
				new TypeReference<Map<String, T>>() {
				});
		Map<String, T> result = new HashMap<String, T>();
		for (Entry<String, Map<String, Object>> entry : map.entrySet()) {
			result.put(entry.getKey(), map2Bean(entry.getValue(), clazz));
		}
		return result;
	}

	/**
	 * json array string convert to list with javaBean
	 */
	public static <T> List<T> json2BeanList(String jsonArrayStr, Class<T> clazz)
			throws Exception {
		List<Map<String, Object>> list = objectMapper.readValue(jsonArrayStr,
				new TypeReference<List<T>>() {
				});
		List<T> result = new ArrayList<T>();
		for (Map<String, Object> map : list) {
			result.add(map2Bean(map, clazz));
		}
		return result;
	}

	/**
	 * map convert to javaBean
	 */
	public static <T> T map2Bean(Map map, Class<T> clazz) {
		return objectMapper.convertValue(map, clazz);
	}
}

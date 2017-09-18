package com.zj.ws.resource.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @Description: JSON处理工具类
 * @author Jian Jang
 * @version 1.0 2017年7月13日
 */
public class JsonUtils {

	private static Log log = LogFactory.getLog(JsonUtils.class);

	/**
	 * Map转换为JSON字符串
	 * @param map 需要转换的Map
	 * @return
	 */
	public static <E, V> String map2JsonString(Map<E, V> map) {
		try {
			ObjectMapper objectMapper = instanceObjectMapper();
			if (map == null || map.isEmpty()) {
				return EMPTY_JSON_STRING;
			}
			return objectMapper.writeValueAsString(map);
		} catch (JsonParseException e) {
			log.error(e.getMessage(), e);
		} catch (JsonMappingException e) {
			log.error(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * List转换为JSON字符串
	 * @Description
	 * @param list
	 * @return
	 */
	public static <E> String list2JsonString(List<E> list) {
		try {
			ObjectMapper objectMapper = instanceObjectMapper();
			if (list == null || list.isEmpty()) {
				return EMPTY_JSON_STRING;
			}
			return objectMapper.writeValueAsString(list);
		} catch (JsonParseException e) {
			log.error(e.getMessage(), e);
			
		} catch (JsonMappingException e) {
			log.error(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			
		}
		return null;
	}

	/**
	 * Object转换为JSON字符串
	 * @Description
	 * @param obj
	 * @return
	 */
	public static String obj2JsonString(Object obj) {
		try {
			ObjectMapper objectMapper = instanceObjectMapper();
			if (obj == null) {
				return EMPTY_JSON_STRING;
			}
			return objectMapper.writeValueAsString(obj);
		} catch (JsonParseException e) {
			log.error(e.getMessage(), e);
			
		} catch (JsonMappingException e) {
			log.error(e.getMessage(), e);
			
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			
		}
		return null;
	}

	/**
	 * JSON字符串转换为Map
	 * @param strJsonString 需要转换的JSON字符串
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <E, V> Map<E, V> jsonString2Map(String strJsonString) {
		try {
			ObjectMapper objectMapper = instanceObjectMapper();
			if (StringUtils.isBlank(strJsonString)) {
				strJsonString = EMPTY_JSON_STRING;
			}
			return objectMapper.readValue(strJsonString, Map.class);
		} catch (JsonParseException e) {
			log.error(e.getMessage(), e);
			
		} catch (JsonMappingException e) {
			log.error(e.getMessage(), e);
			
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			
		}
		return null;
	}

	/**
	 * JSON字符串转换为Object
	 * @param strJsonString 需要转换的JSON字符串
	 * @param clazz
	 * @return
	 */
	public static <T> T jsonString2Object(String strJsonString, Class<T> clazz) {
		try {
			ObjectMapper objectMapper = instanceObjectMapper();
			if (StringUtils.isBlank(strJsonString)) {
				strJsonString = EMPTY_JSON_STRING;
			}
			return objectMapper.readValue(strJsonString, clazz);
		} catch (JsonParseException e) {
			log.error(e.getMessage(), e);
			
		} catch (JsonMappingException e) {
			log.error(e.getMessage(), e);
			
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			
		}
		return null;
	}

	public static void main(String[] args) {
		/*
		 * WsMessage message = new WsMessage(); message.setpVersion("10001");
		 * message.setpErrCode("MG00006F"); message.setpErrMsg(
		 * "%e5%bf%85%e8%a6%81%e5%8f%82%e6%95%b0(%e8%bd%ac%e5%87%ba%e6%96%b9)%e4%b8%8d%e8%83%bd%e4%b8%ba%e7%a9%ba%ef%bc%81"
		 * ); message.setP3DesParam(
		 * "pDt7KwdazY8eBLHf0pcD7Gcx%2byfKAeKTXYJZ%2bPcq66WdP5LtcKGJZ6QzRCbAuVzASq2ptJr4cOPe9B2mzWZhW2u0lmOYKNge4WcULdFlL1QAqcvBiOLIVw%3d%3d"
		 * ); message.setpSign("c5e65ec5f13baa376c4385d3d50050c7"); String
		 * sbJson = obj2JsonString(message);
		 * System.out.println("message========== : " + sbJson); WsMessage
		 * message1 = jsonString2Object(sbJson, WsMessage.class); String sbJson1
		 * = obj2JsonString(message1);
		 * System.out.println(obj2JsonString("message1========== : " +
		 * sbJson1));
		 */
	}

	/**
	 * 实例化ObjectMapper
	 * @return
	 */
	public static ObjectMapper instanceObjectMapper() {
		JsonFactory jf = new JsonFactory();
		jf.configure(Feature.WRITE_NUMBERS_AS_STRINGS, true);
		return new ObjectMapper(jf);
	}

	/**
	 * 空JSON字符串
	 */
	private final static String EMPTY_JSON_STRING = "{}";
}

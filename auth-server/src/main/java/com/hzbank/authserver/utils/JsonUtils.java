package com.hzbank.authserver.utils;

import com.alibaba.fastjson.JSON;

/**
 * @author ：liush
 * @date ：Created in 2019/8/1 15:11
 * @description：
 * @modified By：
 * @version: $
 */
public class JsonUtils {

    /**
     * 将对象转化为json字符串
     * @param source Java对象
     * @return java.lang.String
     */
    public static <K> String toJson(K source){
        return JSON.toJSON(source).toString();
    }

    /**
     * 将json字符串还原为目标对象
     * @param source json字符串
     * @return K
     */
    public static <T> T fromJson(String source, Class<T> clazz){
        return JSON.parseObject(source, clazz);
    }
}

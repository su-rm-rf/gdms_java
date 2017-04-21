package com.yuhualing.www.gdms.util;

/**
 * Created by macbook on 17/4/21.
 */
public class StringUtil {

    public static boolean isBlank(String str) {
        return "" == str || null == str || "null" == str;
    }

}

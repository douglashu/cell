package com.lj.utils;

import com.lj.emnus.CodeEnum;

/**
 * Created by Loki
 * Author:李晋
 * Create Time:2017/9/21
 */


public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}

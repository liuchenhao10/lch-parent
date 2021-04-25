package com.lch.commonbaseutils.uuid;

import java.util.UUID;

/**
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/25 17:09
 */

public class UUIDUtils {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }
}

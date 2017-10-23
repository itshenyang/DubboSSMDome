package com.keruis.keruis_pojo.Utils;

import java.util.UUID;

/**
 * Created by Administrator on 2017/3/22.
 */
public class UUIDUtils {

    public static String generateToken(String id) {
        return id + generateUUID();
    }

    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }

}

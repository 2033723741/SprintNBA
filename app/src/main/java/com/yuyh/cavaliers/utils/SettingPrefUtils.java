package com.yuyh.cavaliers.utils;

import com.yuyh.library.utils.data.PrefsUtils;

/**
 * @author yuyh.
 * @date 16/6/26.
 */
public class SettingPrefUtils {

    public static String getUid() {
        return new PrefsUtils().get("uid", "");
    }

    public static void saveUid(String uid) {
        new PrefsUtils().put("uid", uid);
    }

    public static String getToken() {
        return new PrefsUtils().get("token", "");
    }

    public static void saveToken(String token) {
        new PrefsUtils().put("token", token);
    }

    public static String getUsername() {
        return new PrefsUtils().get("username", "");
    }

    public static void saveUsername(String username) {
        new PrefsUtils().put("username", username);
    }

    public static String getNickname() {
        return new PrefsUtils().get("nickname", "");
    }

    public static void saveNickname(String nickname) {
        new PrefsUtils().put("nickname", nickname);
    }

}

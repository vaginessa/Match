package com.holo.web.request.data;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 根深 on 2016/2/22.
 */
public class BasicData {
    Map<String, String> data = new HashMap<>();

    public String getString(String name) {
        Object o = data.get(name);
        if (o != null) {
            try {
                return URLDecoder.decode(o.toString(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public int getInt(String name) {
        Object o = data.get(name);
        if (o != null) {
            try {
                return Integer.parseInt(o.toString());
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
        return 0;
    }
    public long getLong(String name) {
        Object o = data.get(name);
        if (o != null) {
            try {
                return Long.parseLong(o.toString());
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
        return 0;
    }
}

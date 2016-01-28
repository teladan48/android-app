package com.reidzeibel.teladan48app.util;

import java.util.List;

/**
 * Created by Reidzeibel on 28/01/2016.
 */
public class Util {

    public static String listToString(List<?> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += " " + list.get(i).toString();
        }
        return result;
    }
}

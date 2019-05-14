package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Abraham", df.parse("JULY 3 1981"));
        map.put("Abraham2", df.parse("JANUARY 5 1981"));
        map.put("Abraham3", df.parse("FEBRUARY 7 1981"));
        map.put("Abraham4", df.parse("MARCH 13 1981"));
        map.put("Abraham5", df.parse("APRIL 25 1981"));
        map.put("Abraham6", df.parse("MAY 5 1981"));
        map.put("Abraham7", df.parse("AUGUST 7 1981"));
        map.put("Abraham8", df.parse("SEPTEMBER 2 1981"));
        map.put("Abraham9", df.parse("NOVEMBER 22 1981"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> list = new ArrayList<>();

        map.forEach((k,v)->{
            if(v.getMonth() >=5 && v.getMonth() <= 7) {
                list.add(k);
            }
        });
        for (String s : list) {
            map.remove(s);
        }
    }

    public static void main(String[] args) throws ParseException {
        HashMap <String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}

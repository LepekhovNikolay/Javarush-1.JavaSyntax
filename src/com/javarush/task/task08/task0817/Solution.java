package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.putIfAbsent("Smirnov","Dmitriy");
        map.putIfAbsent("Sidorov","Ivan");
        map.putIfAbsent("Pupkov","Jenya");
        map.putIfAbsent("Ivanov","Andrey");
        map.putIfAbsent("Kruglov","Uliana");
        map.putIfAbsent("Lepekhov","Denis");
        map.putIfAbsent("Mazureno","Denis");
        map.putIfAbsent("Novikov","Dmitriy");
        map.putIfAbsent("Udalov","Anna");
        map.putIfAbsent("Zyabikova","Anna");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, String> copyMap = new HashMap<>(map);
        for (String text: copyMap.values()) {
            if(set.contains(text))
                removeItemFromMapByValue(map, text);
            else
                set.add(text);
        }

        /* ArrayList<String> allnames = new ArrayList<>();//хранилище всех имен из карты
        map.forEach((k,v) -> {//сам поиск и запись всех имен
            allnames.add(v);
        });
        ArrayList<String> dublicatenames = new ArrayList<>();//создание списка повторяющихся имен
        for (int i = allnames.size()-1; i >=0; i--) {//поиск и запись в список повторяющихся имен
            String currentname = allnames.get(i);//создание переменной, в которую записываем имя
            allnames.remove(i);//удаляем просмотренное имя
            if(allnames.contains(currentname)){//проверяем, существуют ли еще такие же имена
                dublicatenames.add(currentname);//если существуют, то имя записываем в список дубликатов
                for (int j = 0; j < allnames.size(); j++) {//создаем цикл размером с оставшийся список всех имен
                    if (currentname.equals(allnames.get(j))){//если попалось дубликатное имя, то его удаляем,
                        allnames.remove(j);
                        j--;//и в связи с тем, один элемент удалили, то уменьшаем сче, чтобы попасть в тот же индекс
                        i--;//в основном цикле делаем тоже самое
                    }
                }
            }
        }
        dublicatenames.forEach(k -> removeItemFromMapByValue(map, k));*/
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    //    map.forEach((k,v)-> System.out.println(k+v));
    }
}

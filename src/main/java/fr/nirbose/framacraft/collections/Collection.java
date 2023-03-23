package fr.nirbose.framacraft.collections;

import java.util.HashMap;
import java.util.Map;

public class Collection {

    final private static Map<Object, Object> items = new HashMap<>();

    public static void add(Object key, Object value) {
        items.put(key, value);
    }

    public static Object get(Object key) {
        return items.get(key);
    }

}

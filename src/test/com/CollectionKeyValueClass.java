package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionKeyValueClass {
public static void main(String[] args) {
	   List<KeyValue<String, String>> list = new ArrayList<>();
       list.add(new KeyValue<>("apple", "String1"));
       list.add(new KeyValue<>("banana", "String"));
       list.add(new KeyValue<>("orange", "String"));
       list.add(new KeyValue<>("orange","orange"));

       System.out.println(containsElement(list, "banana")); // true
       System.out.println(containsElement(list, "grapes"));  // false

       Set<Integer> set = new HashSet<>();
       set.add(10);
       set.add(20);
       set.add(30);

       System.out.println(set.contains("orange")); // false (since "orange" is not added to the set)
       System.out.println(set.contains(10)); // true
   }

   private static <K, V> boolean containsElement(List<KeyValue<K, V>> list, K element) {
       for (KeyValue<K, V> keyValue : list) {
           if (keyValue.getKey().equals(element)) {
               return true;
           }
       }
       return false;
   }

   private static class KeyValue<K,V> {
       private final K key;
       private final V value;

       public KeyValue(K key, V value) {
           this.key = key;
           this.value = value;
       }

       public K getKey() {
           return key;
       }

       public V getValue() {
           return value;
       }
   }
}
package Class_Work.Collections;
import java.util.*;
public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer,String> map2 = new HashMap<>();
        TreeMap<Integer,String> map1= new TreeMap<>();
        map2.put(3,"Shubham");
        map2.put(1,"Sumit");
        map2.put(2,"Sameer");
        System.out.println(map2);

        map1.put(3,"Shubham");
        map1.put(1,"Sumit");
        map1.put(2,"Sameer");
        System.out.println(map1);


        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Aman");
        map.put(20, "Rahul");
        map.put(30, "Shubham");
        map.put(40, "Priya");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.higherKey(20));
        System.out.println(map.lowerKey(20));
        System.out.println(map.ceilingKey(25));
        System.out.println(map.floorKey(25));
        System.out.println(map.descendingMap());


        HashMap<String,Integer> st = new HashMap<>();
        st.put("Shubham",3);
        st.put("Sameer",1);
        st.put("Sumit",2);
        System.out.println(st);

        TreeMap<String,Integer> st1 = new TreeMap<>();
        st1.put("Shubham",3);
        st1.put("Sameer",1);
        st1.put("Sumit",2);
        System.out.println(st1);

        LinkedHashMap<String,Integer> st2 = new LinkedHashMap<>();
        st2.put("Shubham",3);
        st2.put("Sameer",1);
        st2.put("Sumit",2);
        System.out.println(st2);
    }
}

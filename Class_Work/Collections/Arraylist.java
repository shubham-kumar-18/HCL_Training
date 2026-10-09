package Class_Work.Collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
        list.set(2,100);
        list.set(3,500);
        System.out.println();
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove(4);
        System.out.println(list);

        list.addLast(90);
        System.out.println(list);

        System.out.println(list.size());





    }
}

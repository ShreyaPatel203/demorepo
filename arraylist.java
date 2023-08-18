import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class arraylist{

    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //to get an element
        int element=list.get(0);
        System.out.println(element);

        //add element in between
        list.add(3,4);
        System.out.println(list);

        //set element
        list.set(0,0);
        System.out.println(list);

        //delete element
        list.remove(0); //only index
        System.out.println(list);

        //size of list
        int size=list.size();
        System.out.println(size); 
        
        //loops on lists
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println( );

        //sorting the list
        list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }

}
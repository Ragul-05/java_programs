import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
public class array{
    public static void main (String args[]){
        //to find out the maximum element in the arraylist

        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Enter the elements to be added in the arraylist:");
        list.add(45);
        list.add(23);
        list.add(56);
        list.add(78);
        list.add(43);

        System.out.println("Before sorting of an array:"+ list);
        Collections.sort(list);
        System.out.println("After sorting of an array:"+list);
        int max;
        max = list.get(-1);
        System.out.println("Maximum value of an array:"+max);


    }

}
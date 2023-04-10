package nikhilAllPrograms;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsecutiveNumbersArray {
    @Test
    public void get(){
        int [] n={15,3,5,4,6,9,10,34};
        int first,count=0;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n.length;i++){
            list.add(n[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        first=list.get(0).intValue();
        System.out.print("Longest Sequence is  : ");
        for(Integer u:list){
           if(first==u){
               first++;
               count++;

               System.out.print(u+" ");
           }else  break;
        }
        System.out.println();
        System.out.println("Count is : "+count);
    }
    @Test
    public void set(){
        int [] no={12,13,46,14,23,144,24,15,25,26};
        int first,count=0;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<no.length;i++){
            list.add(no[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        first=list.get(0).intValue();
        System.out.println("first  Value "+first);
        System.out.println("Longest Sequence is : ");
        for(Integer value:list) {

            if (first == value) {
                first++;
                count++;

                System.out.println(value + "  ");
            } else break;
        }
        System.out.println();
        System.out.println("Count is : "+count);
    }

}

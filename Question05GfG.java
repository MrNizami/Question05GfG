package Arrays;

import java.util.*;

public class Question05GfG {
    // Chocolate Distribution Problem

    public static void main(String[] args) {
        int minimum =Integer.MAX_VALUE;
        int min= Integer.MAX_VALUE;
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};

        int m = 7;

        Arrays.sort(arr);

        int i=0;
        int j =(i+m-1);


        while(j<=(arr.length-1)){
            min = (arr[j]-arr[i]);
            if(min<minimum){
                minimum = min;
            }
            i++;
            j++;
        }
        
   


        System.out.println(minimum);
       
    }

}

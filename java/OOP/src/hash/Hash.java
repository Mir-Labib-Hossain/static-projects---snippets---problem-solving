    package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {
      
        int arr1[] = {1,2,3,43,5,3};
        int arr2[] = {1,2,3,44,3};
        
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1 + l2;
        
        int[] arr3 = new int[l3];
        
        //arr3 = arr1 + arr2;
        System.arraycopy(arr1, 0, arr3, 0, l1);
        System.arraycopy(arr2, 0, arr3, l1, l2);
        
        HashMap hm = new HashMap();
        
        System.out.println(Arrays.toString(arr3));
        for(int i=0; i < l3; i++){
            hm.put(arr3[i],1);
        }
        System.out.println(hm.keySet());
        
    }
    
}


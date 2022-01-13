package array.compare;


public class ArrayCompare {
    static void arr(int[] arr1, int[] arr2){
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 8, 3, 5};
        int[] arr2 = {1, 2, 8, 4, 5};
        
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1 + l2;
        
        int[] arr3 = new int[l3];
        int c=0;
        
        //arr3 = arr1 + arr2;
        System.arraycopy(arr1, 0, arr3, 0, l1);
        System.arraycopy(arr2, 0, arr3, l1, l2);

        System.out.print("[ ");
        for(int i=0; i<l3; i++)
        {
            for(int j=0; j<l3; j++)
            {
                if( i != j && arr3[i] == arr3[j]) 
                    c=1;
            }
            if(c==0)
                System.out.print(arr3[i]+" ");
            c=0;
        }
        System.out.println("]"); 
    }
}

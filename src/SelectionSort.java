import java.util.Arrays;

public class SelectionSort {
    
        static int[] selectionSort(int[] arr)
        {
            for(int i =0; i<arr.length;i++)
            {
                for(int j = i+1; j<arr.length; j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr ={ 2,5,1,7,3,4,9,4};
            System.out.println(Arrays.toString(selectionSort(arr)));
        }
    

}

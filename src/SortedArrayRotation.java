import java.util.Arrays;

public class SortedArrayRotation {
    static int[] rotateArray(int[] arr,int d,int n)
    {
        int[] temp = new int[n];
        int k=0;
        for(int i = d; i < n; i++)
        {
            temp[k] = arr[i];
            k++;
        }
        for(int i =0; i < d; i++)
        {
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0; i < n ; i++)
        {
            arr[i]=temp[i];
        }
        return arr;
    }
    static int binary(int[] arr, int find ,int left, int right)
    {

//        int mid =(left+right)/2;
        if(left<=right)
        {
            int mid = (left+right)/2;

            if(arr[mid] == find)
                return mid;
            else if(arr[mid]<find)
                return binary(arr,find,mid+1,right);
            else
                return binary(arr,find,left,mid-1);

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int target = 8;
        int pivot =2;
        int[] rotated_array = rotateArray(array,pivot, array.length);
        System.out.println(Arrays.toString(rotated_array));
        int i = binary(rotated_array,target,0,array.length-1);
        System.out.println(i);
    }
}

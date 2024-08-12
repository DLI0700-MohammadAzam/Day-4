import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] arr, int find ,int left, int right)
    {

//        int mid =(left+right)/2;
        if(left<=right)
        {
            int mid = (left+right)/2;

            if(arr[mid] == find)
                return mid;
            else if(arr[mid]<find)
                return binarySearch(arr,find,mid+1,right);
            else
                return binarySearch(arr,find,left,mid-1);

        }
        return -1;

    }
    public static void main(String[] args) {


        int[] array = {1, 5, 8, 10, 34, 55};
        int Target = 10;
        int left=0,right=array.length - 1 ;
        int i = binarySearch(array,Target,left,right);

        if(i!=-1)
            System.out.println("the index of "+Target+" is "+i);
        else
            System.out.println("element not found");
    }

}

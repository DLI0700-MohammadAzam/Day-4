public class SmallestEqualLargest {
    static int firstOccurrence(int[] arr, int target, int left, int right) {

//        [1,2,3,4,4,4,5,6,7]
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                if(arr[mid-1] == target)
                    return firstOccurrence(arr,target,left,mid-1);
                else
                    return mid;

            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;


//            System.out.println("kj");
        }
        return -1;
    }
    static int lastOccurrence(int[] arr, int target, int left, int right) {

//        [1,2,3,4,4,4,5,6,7]
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                if(arr[mid+1] == target)
                    return lastOccurrence(arr,target,mid+1,right);
                else
                    return mid;

            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;


//            System.out.println("kj");
        }
        return -1;
    }
//
    //    static int lastOccurrence(int[] arr, int target)
//        return -1;
//    }

    public static void main(String[] args) {

        int[] array = {1,2,3,3,4,4,4, 4, 4 ,4,5,5,5,5,5,5,5,5,5,6,7};
        int target = 5;
        int left = 0, right = array.length - 1 ;
        int i = firstOccurrence(array,target,left,right);
        int j = lastOccurrence(array,target,left,right);
        System.out.println("first  occurrence of the "+target+" is "+i);
        System.out.println("Last occurrence of the "+target+" is "+j);

    }
}

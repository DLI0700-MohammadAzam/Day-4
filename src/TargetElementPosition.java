public class TargetElementPosition {



        static int Position(int[] arr, int find ,int left, int right)
        {

//        int mid =(left+right)/2;
            if(left<=right)
            {
                int mid = (left+right)/2;

                if(arr[mid] == find)
                    return mid;
                else if(arr[mid]<find)
                    return Position(arr,find,mid+1,right);
                else
                    return Position(arr,find,left,mid-1);

            }
            return -1;

        }
        public static void main(String[] args) {


            int[] array = {1, 5, 8, 10, 34, 55};
            int Target = 111;
            int left=0,right=array.length - 1;
            int i = Position(array,Target,left,right);
//            System.out.println(i);
            if(i!=-1)
                System.out.println("the position of "+Target+" is "+(i+1));
            else
                System.out.println("element not found");
        }

    }



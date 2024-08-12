import java.util.ArrayList;
import java.util.Scanner;

public class ListOfIntegers {
    static ArrayList<Integer> occurrence(ArrayList<Integer> arr,int ele)

    {

        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0; i< arr.size(); i++)
        {
            if(arr.get(i)==ele)
                indices.add( i);
        }
       return indices;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the number of elements ");
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        System.out.println("Enter "+n+" Elements ");
        for(int i=0; i<n; i++)
        {
            array.add(input.nextInt());
        }
        System.out.println("Enter the element");
        int element = input.nextInt();
        ArrayList<Integer> indices =occurrence(array,element);
        System.out.println("the indices of "+element+" are "+indices);
    }
}

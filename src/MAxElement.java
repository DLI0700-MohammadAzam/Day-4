import java.util.ArrayList;
import java.util.Scanner;

public class MAxElement {
    static int maxElement(ArrayList<Integer> arr)
    {
        int max= arr.indexOf(0);
        for(int i : arr)
        {
            if(i>max)
                max =i;
        }
        return max;
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
        int max =maxElement(array);
        System.out.println("the maximum element is "+max);
    }
}

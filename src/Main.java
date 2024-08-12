
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int linearSearch(int[] array,int val)
    {
        for(int i=0; i<array.length; i++)
            if(array[i] == val)
                return i;
        return -1;
    }
    public static void main(String[] args) {

        System.out.println("Enter the number of element ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter the element ");
            arr[i] = input.nextInt();

        }
        System.out.println("Enter the value to search");
        int index = linearSearch(arr,input.nextInt());
        if(index !=-1)
            System.out.println("the target value is at index "+index);
        else{
            System.out.println("element no found ");
        }



    }
}
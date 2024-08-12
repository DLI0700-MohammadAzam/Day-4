import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerList {
    static int firstOccurrence(List<Integer> nums,int target)
    {
        for(int i : nums)
        {
            if(i==target)
                return nums.indexOf(i);
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements you wants to add");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            numbers.add(input.nextInt());
        }
        System.out.println("Enter the element to find ");

        int find = input.nextInt();
        int i = firstOccurrence(numbers,find);
        if(i !=-1)
            System.out.println("The index of the "+find+" is "+i);
        else
            System.out.println("no such element");

    }

}

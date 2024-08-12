import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("enter the number of elements");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n ; i++)
        {
            numbers.add(input.nextInt());
        }
        System.out.println("Before "+numbers);
        LinkedHashSet<Integer> removed = new LinkedHashSet<>();
        for(int i =0 ; i<n ;i++)
        {
            removed.add(numbers.get(i));
        }
        System.out.println("After "+removed);
    }
}

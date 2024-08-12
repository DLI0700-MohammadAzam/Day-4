import java.util.*;

public class DuplicatesArrayList {
    static List<Integer> numbers = new ArrayList<>();


    public static void main(String[] args) {
        Set<Integer> duplicates = new HashSet<>();
        System.out.println("Enter the number of elements ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            numbers.add(input.nextInt());
        }
        for(int i=0; i< n ;i++)
        {
            for(int j=i+1; j<n;j++){
             if (numbers.get(i).equals(numbers.get(j)))
                 duplicates.add(numbers.get(i));
            }

        }
        System.out.println(duplicates);


    }

}

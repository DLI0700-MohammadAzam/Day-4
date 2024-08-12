import java.util.ArrayList;
import java.util.Arrays;

public class UnionArrayList {
    static ArrayList intersection(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> inter = new ArrayList<>();
        for(int i : list2)
        {
            if(list1.contains(i))
                inter.add(i);

        }
        return inter;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,6,7));
        System.out.println(intersection(list1,list2));

    }
}

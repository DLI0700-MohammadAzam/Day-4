import java.util.Scanner;
import java.util.regex.Pattern;

public class SearchString {
    static int stringSearch(String[] str,String find)
    {
        for(int i=0; i<str.length; i++)
        {
            if(str[i].equals(find))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the main string");
        String mainStr = input.nextLine();
        Pattern ptr =Pattern.compile(" ");
        String[] strArray = ptr.split(mainStr);

        System.out.println("Enter the string to find");
        String target = input.nextLine();
        int index = stringSearch(strArray,target);
        if(index !=-1)
        {
            System.out.println(target+" found at the index "+index);
        }
        else{
            System.out.println("Not found ");
        }



    }
}

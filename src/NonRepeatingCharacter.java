import java.util.*;
public class NonRepeatingCharacter {

    static void firstnonDuplicateCharacter(String str)
    {
        for(char ch : str.toCharArray())
        {
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("The first non-repeating character is " + ch);
                break;
            }

        }
        System.out.println("There are no non-repeating characters ");


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = input.nextLine();
        firstnonDuplicateCharacter(str);


    }
}

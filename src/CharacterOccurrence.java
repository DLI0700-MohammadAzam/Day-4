import java.util.Scanner;

public class CharacterOccurrence
{
    static int characterOccur(String s,char ch)
    {
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            if(ch == (s.charAt(i)))
            {
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = input.nextLine();
        System.out.println("Enter the character ");
        char ch = input.nextLine().charAt(0);

        int result = characterOccur(str,ch);
        if(result !=0)
            System.out.println(ch+" Occurred "+result+" times in the string");
        else
            System.out.println("Error..! char not found");

    }
}

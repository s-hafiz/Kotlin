/*
 * Created by Md. Shahariar Hafiz
 * Count vowel from the String
 */
import java.util.Scanner;

public class VowelCount
{
    private int countVowel(String text)
    {
        //Variable to count vowel
        int count=0;
        for (char Char:text.toCharArray()) //Loop for checking each and every character
        {
            String s = String.valueOf(Char); //Creating a string of that character 'Char'
            if ("aeiou".contains(s.toLowerCase())) //Condition to check that character is vowel or not
               {
                   count += 1;      //If vowel then add 1
               }
        }
        return count;
    }
    public static void main(String[] args)
    {
        VowelCount vc = new VowelCount();
        Scanner input = new Scanner(System.in);
        System.out.println("======== Enter The String ========");
        String str = input.nextLine();
        int result = vc.countVowel(str);
        System.out.println("Total vowel of the inputed string is : "+result);
    }
}

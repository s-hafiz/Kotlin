/*
* Created by Md.Shahariar Hafiz
* Program to remove vowel
*/
class Disemvowel
{
    fun removeVowel(text: String):String
    {
        //Creating a String builder object to store character
        val result = StringBuilder()
        //Loop to check each character in the string
        for (char:Char in text)
        {
            //Condition that the character is vowel or not
            if (!"aeiou".contains(char.toLowerCase()))
            {
                //If not the vowel then append it to the string builder object
                result.append(char)
            }
        }
        //Returning the string builder object as a string
        return result.toString()

    }
}
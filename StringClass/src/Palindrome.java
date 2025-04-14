public class Palindrome
{
    public static void main(String[] args)
    {
        String str="malayalam";
        boolean bool=true;
        int len=str.length();
        for(int i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-1-i))
            {
                bool=false;
                break;
            }
        }
        if(bool)
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not palindrome");
    }
}

package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.PalindromeChecker;

public class PalindromeCheckerRunner
{
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker=(str)->{
            str=str.toLowerCase();
            int j=str.length()-1;
            for (int i=0;i<str.length()/2;i++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    j--;
                }
                else
                    return false;
            }
            return true;
        };
        String str="Amma";
       if(palindromeChecker.isPalindrome(str))
           System.out.println(str+" is palindrome");
       else
           System.out.println(str+" is not palindrome");

    }
}

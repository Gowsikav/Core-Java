package com.xworkz.program.internal;

public class ReverseString {

    public static String reverse(String s)
    {
        char[] reverse=s.toCharArray();
        s="";
        for(int i=reverse.length-1;i>=0;i--)
            s=s+reverse[i];
        return s;
    }

    public static void main(String[] args) {
        String str="RCB will win the match";
        String[] arr =str.split(" ");
        for(int index=2;index<arr.length-1;index++)
        {
            String s=reverse(arr[index]);
            arr[index]=s;
        }
        System.out.println("input: "+str);
        System.out.print("output: ");
        for (String s : arr)
            System.out.print(s + " ");
    }
}

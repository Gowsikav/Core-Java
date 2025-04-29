package com.xworkz.program.internal;

public class WordsLength
{
    public static void main(String[] args) {

        String str="rcb will win the match against csk";
        String[] arr = str.split(" ");
        System.out.println("input: "+str);
        System.out.print("output :");
        for (String s : arr)
            System.out.print(s.length() + " ");
    }
}

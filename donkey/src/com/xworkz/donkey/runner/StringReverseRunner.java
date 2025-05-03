package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.StringReverse;

public class StringReverseRunner
{
    public static void main(String[] args) {
        StringReverse stringReverse=new StringReverse() {
            @Override
            public String reverse(String str) {
                System.out.println("Original string: "+str);
                String st="";
                for(int i=str.length()-1;i>=0;i--)
                    st=st+str.charAt(i);
                return st;
            }
        };
        System.out.println("Reversed string: "+stringReverse.reverse("Welcome"));
    }
}

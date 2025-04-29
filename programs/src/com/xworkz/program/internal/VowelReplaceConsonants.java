package com.xworkz.program.internal;

public class VowelReplaceConsonants {
    public static void main(String[] args) {
        String str="you are welcome";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i];
            if(c=='a' ||c=='i' ||c=='e' ||c=='o' ||c=='u' ||
                    c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
            {
                int num=(int)c;
                num++;
                arr[i]=(char)num;
            }
        }
        System.out.println("input: "+str);
        System.out.print("output: ");
        for(char c:arr)
            System.out.print(c);
    }
}

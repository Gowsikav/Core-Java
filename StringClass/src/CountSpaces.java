public class CountSpaces {
    public static void main(String[] args) {
        String str="We are learning java";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                count++;
        }
        System.out.println("No of spaces: "+count);
    }
}

public class Reverse
{
    public static void main(String[] args) {

        String str = "Good";
        char[] a = str.toCharArray();
        System.out.print("Reversed word: ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }

}

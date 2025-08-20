import java.util.Scanner;

public class IntervalOverLapping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row");
        int r=scanner.nextInt();
        System.out.println("Enter colum");
        int c=scanner.nextInt();

        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= scanner.nextInt();
            }
        }

        int[][] result=new int[r][c];
        int iIndex=0;
        int jIndex=0;


        System.out.println("===================");
        for(int i=0;i<r;i++)
        {

            if(i+1<arr.length && arr[i][1]>arr[i+1][0])
            {
                System.out.println(arr[i][0]+" "+arr[i+1][1]);
                result[iIndex][0]=arr[i][0];
                result[iIndex][1]=arr[i+1][1];
                iIndex++;

                i++;
                jIndex++;
                continue;
            }
            System.out.println(arr[i][0]+" "+arr[i][1]);
            result[iIndex][0]=arr[i][0];
            result[iIndex][1]=arr[i][1];
            iIndex++;
        }

        System.out.print("[");
        for(int i=0;i<r-jIndex;i++)
        {
            System.out.print("[");
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]!=0) {
                    System.out.print(result[i][j]);
                    if(j==0)
                        System.out.print(",");
                }
            }
            System.out.print("],");
        }
        System.out.println("]");
    }
}

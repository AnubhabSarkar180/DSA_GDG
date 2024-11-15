import java.util.*;
public class problem3 {
    public static void main(String args[])
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        int arr[]=new int[10];
        arr[0]=1;
        int c=1;
        int prod=0;
        while(prod<num)
        {
            for(int i=2;i<=num;i++)
            {
                prod=i*(i-1);
                if(prod<num)
                {
                    arr[c]=prod;
                    c++;
                }
                else{
                    break;
                }
            }
        }       
        System.out.println("Array elements: ");
        for(int i=0;i<c;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

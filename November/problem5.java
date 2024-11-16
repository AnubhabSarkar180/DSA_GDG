import java.util.*;
public class problem5 {
    public int check(int x, int y, int z)
    {
        int res=5*x+10*y;
        int c=0;
        while(res>=0)
        {
            
            
                res=res-z;
                c++;
        }
        return (c-1);
    }
    public static void main(String[] args)
    {
     int tc=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of tests to run: ");
     tc=sc.nextInt();
     System.out.println("Enter the values of \n 5 rupee coins and \n  10 rupee coins and  \n the cost of each candy in the store: ");
     for(int i=1;i<=tc;i++)
     {
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int res=new problem5().check(x,y,z);
        System.out.println("Maximum number of candies that can be bought: "+res);
     }   
    }
}

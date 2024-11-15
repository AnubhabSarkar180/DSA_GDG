import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int scmax=-1;
        for(int i=0;i<5;i++)
        {
            if(arr[i]>scmax && arr[i]!=max)
            {
                scmax=arr[i];
            }
        }
        System.out.println("Second largest element of the array is: "+scmax);
    }    
}

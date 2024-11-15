// Consider a range of NUMBERS. If the NUMBER exists at the very end of its
// squared value, print the NUMBER. EXAMPLE:
// 25 is such a number. 25*25=625. Hence 25 comes at the end of 625. Thus 25 needs
// to be printed. RANGE: Consider the range 10 to 999

public class problem1{
    public int check(int num,int sq)
    {
        while(num>0)
        {
            if(num%10 != sq%10)
            {
                return 0;
            }
            num/=10;
            sq/=10;
        }
        return 1;
    }
    public static void main(String[] args){
        for(int i=10;i<=999;i++)
        {
            int sqr=0;
            sqr=i*i;
            int res=new problem1().check(i,sqr);
            if(res==1)
            {
                System.out.println(i+" ");
            }
        }
    }
}
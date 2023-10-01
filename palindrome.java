import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int a,num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        int n=a;
        while(n>0)
        {
            num=n%10;
            sum=sum*10+num;
            n=n/10;
        }
        if(sum==a)
        System.out.println("This is a palindrome Number");
        else
        System.out.println("It is NOT a PALINDROME number");
    }
}
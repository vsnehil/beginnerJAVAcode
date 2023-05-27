import java.util.*;
class calcu
{
    public static void main(String args[])
{
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter 1 for addition, Enter 2 for multiplication, Enter 3 for subtraction, Enter 4 for division");
int ch=sc.nextInt();
if(ch==1)
{
    c=a+b;
    System.out.println("Addtion of these number is"+c);
}
else if(ch==2)
{
    c=a*b;
    System.out.println("Multiplication of these number is"+c);
}
else if(ch==3)
{
    c=a-b;
    System.out.println("Subtraction of these number is"+c);
}
else if(ch==4)
{
    c=a/b;
    System.out.println("Division of these number is"+c);
}
}
}

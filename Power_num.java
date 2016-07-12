import java.util.*;
class Power_num
{
public static void main(String args[])
{
int n,x;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=sc.nextInt();
double power=Math.pow(n,x);
System.out.println("Power is"+power);
}
}
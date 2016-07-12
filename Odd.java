import java.util.*;
class Odd
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
if(n%i==0)
{
break;
}
else
{
System.out.println("Odd");
}
}
}
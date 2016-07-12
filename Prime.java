import java.util.*;
class Prime
{
public static void main(String args[])
{
int n,i,flag=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
	flag=1;
}
}
if(flag==1)
{
System.out.println("Not Prime number");
}
else
{
System.out.println("Prime number");
}
}
}

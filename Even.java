import java.util.*;
class Odd
{
public static void main(String args[])
{
int n,m;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
for(int i=n;i<m;i++)
{
if(n%2==0)
{
System.out.println(i);
}
}
}
}
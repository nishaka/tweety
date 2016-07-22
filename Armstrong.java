import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
int k,r,d=0;
n=sc.nextInt();
k=n;
while(n>0)

{
r=n%10;
d=d+r*r*r;
n=n/10;
}
if(k==r)
{
System.out.println("Armstrong number")
}
else
{
System.out.println("They are not");
}
}
}

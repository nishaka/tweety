import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int n,r,d=0,k;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=n;
while(n>0)
{
r=n%10;
d=d*10+r;
n=n/10;
}
if(k==d)
{
System.out.println("Palindrome number");
}
else
{
System.out.println("Not palindrome");
}
}
}
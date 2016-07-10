import java.util.*;
class Largest
{
public static void main(String args[])
{
int n1,n2,n3;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
int max;
if ((n1>n2)&&(n1>n3))
{
max=n1;
}
else if(n2>n3)
{
max=n2;
}
else
{
max=n3;
}
System.out.println(max);
}
}

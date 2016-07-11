import java.util.*;
class Count_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int count=0;
n=sc.nextInt();
while(n>0)
{
int r=n%10;
count++;
r=n/10;
}
System.out.println(count);
}
}

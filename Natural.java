import java.util.*;
class Natural
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int nat=(n*(n+1))/2;
System.out.println("Natural number"+nat);
}
}
import java.util.Scanner;
public class vowal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter character");
char ch=sc.next().charAt(0);

if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')

System.out.println("char is a vowal");

else

System.out.println("char is a consolent");
}}
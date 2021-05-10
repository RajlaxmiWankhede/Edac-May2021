import java.util.Scanner;
public class DecimalToBinaryExample{  
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Input a Decimal Number :");  
int dec_num=sc.nextInt();
  
System.out.println("Binary number is: "+Integer.toBinaryString(dec_num));  
}}  
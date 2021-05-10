import java.util.Scanner;
public class DecimalToHexExample{  
public static void main(String args[]){  
System.out.print("Input a decimal number: ");  

Scanner sc=new Scanner(System.in);

int num=sc.nextInt();
System.out.println("Hexadecimal number is: "+Integer.toHexString(num));  
  
}
}  
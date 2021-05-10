import java.util.Scanner;
import java.lang.Math;
class Program24{

public static void main(String[] args){

//Scanner sc=new Scanner(System.in);

int binaryNumber=111;//111

System.out.print("Input a Binary Number:"+binaryNumber);



int rem,decimalNumber=0,i=0,octalNumber=0,dec,decrem;

while(binaryNumber!=0){

rem=(int)binaryNumber%10;

decimalNumber=decimalNumber+rem*(int)Math.pow(2,i);
++i;

binaryNumber=binaryNumber/10;//7


}
//System.out.println(decimalNumber);
i=1;

while(decimalNumber!=0){

rem=decimalNumber%8;

octalNumber=octalNumber+rem*i;
i=i+10;

octalNumber=octalNumber/18;
}

System.out.println("Octal number: "+octalNumber);


}

}
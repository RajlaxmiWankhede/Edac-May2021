class Pattern_18

{
  public static void main(String abc[])
  {
for(char i='E';i>='A';i--)
{
for(char j=i;j<=i;j++)
{
System.out.print(" ");
}
for(char k='A';k<=i;k++)
{
System.out.print(k+ " ");
}
System.out.println();
}}}
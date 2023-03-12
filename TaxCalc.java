import java.util.*;
class Tax_Calc
{
public static void main(String [] args)
{
System.out.println("Tax Calculator App");
System.out.println("------------------------");
System.out.println("\nEnter total person count");
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
long sal[]=new long[n];
String names[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter name 1 : "+(i+1)+"");
names[i]=sc.next();
System.out.println("Enter "+names[i]+"'s Annual Income:");
sal[i]=sc.nextLong();
}
System.out.println("Name with liable taxes\n---------------------------\n");
for(int i=0;i<n;i++)
{

System.out.println(calculateTax(names[i],sal[i]));
}
}
public static String calculateTax(String n,long inc)
{
long tx=0;
if(inc>=300000)
{
tx=(20*inc)/100;
}
else if(inc>=100000)
tx=(10*inc)/100;
else if(inc>0)
tx=0; 
return n+": ₹"+tx;
}
}

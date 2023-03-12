import java.util.Scanner;
public class Main
{
    public static void main(String [] args)throws java.lang.Exception
    {
      String name ="",bg="",group="";
      int age=0;
      Scanner sc=new Scanner(System.in);
      if(sc.hasNext())
      name=sc.next();
      if(sc.hasNext())
      age=sc.nextInt();
      if(sc.hasNext())
      bg=sc.next();
      
      if(age>=20)
      group="RED";
      else if(age>=15&&age<20)
      group="BLUE";
      else if(age>=10&&age<15)
      group="YELLOW";
      System.out.println("-------------------------------------");
      System.out.println("Name:"+name+"\nAge:"+age+"\nBlood Group:"+group);
      System.out.println("-------------------------------------");
      System.out.println("Your group is "+group);
      System.out.println("-------------------------------------");
      
    }
}
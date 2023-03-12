import java.util.*;
public class Cake
{
private String name="";
private float price=0.0f;
public float getPrice()
{
return price;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public void setPrice(float price)
{
this.price=price;
}
public void display()
{
System.out.println(name+":₹"+price);
}
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);
ArrayList<Cake> ck=new ArrayList<Cake>();
ArrayList<Pastry> pst=new ArrayList<Pastry>();
Cake c1=new Cake();
c1.setName("Chocolate Brownie");
c1.setPrice(250);
Pastry p1=new Pastry();
p1.setName("Black Forest");
p1.setPrice(35);

//---------------------------------------


Cake c2=new Cake();
c2.setName("Chocolate Maple");
c2.setPrice(300);
Pastry p2=new Pastry();
p2.setName("Choco Truffle");
p2.setPrice(40);
ck.add(c1);
ck.add(c2);
pst.add(p1);
pst.add(p2);
System.out.println("Today's Special Menu");
System.out.println("-----------------------");
System.out.println("Special Cakes");
System.out.println("-------------------------");
for(Cake c :ck)
{
c.display();
}
for(Pastry p :pst)
{
p.display();
}
}
}
class Pastry extends Cake
{

@Override
public void display()
{
//System.out.println("Special Pastries");
//System.out.println("-----------------------");
System.out.println(getName()+": ₹"+super.getPrice());
}
}

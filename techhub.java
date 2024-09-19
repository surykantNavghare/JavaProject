import java.util.*;
public class techhubApp;
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
 int id,fees;
 String name;

 System.out.printf("Enter your name");
  name=xyz.nextLine();
  System.out.printf("Enter your id");
  id=xyz.nextInt();
   System.out.printf("Enter your fees");
   fees=xyz.nextInt();
   System.out.printf(" name is %s\n",name);
   System.out.printf("id is %d\n",id);
   System.out.printf("fees is%d\n",fees);
}
}

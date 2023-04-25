import java.util.Scanner;
class product{
             int pcode;
             int price;
             String pname;
product(int pcode,String pname,int price)
{   
   this.pcode=pcode;
   this.pname=pname;
   this.price=price;
   
}
}
public class products
{
 public static void main(String[]args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the product code:");
 int pcode=sc.nextInt();
 System.out.println("enter the product name:");
 String pname=sc.next();
  System.out.println("enter the product price:");
 int price=sc.nextInt();
 
 product[]ps=new product[3];
 ps[0]=new product(pcode,pname,price);
 ps[1]=new product(101,"pen",90);
 ps[2]=new product(102,"book",50);
 
 int minprice=ps[0].price;
 System.out.println("code \tname \tprice ");
 
 for(product p:ps){
 System.out.print(p.pcode+"\t"+p.pname+"\t"+p.price+"\n");
 if(minprice>p.price)
 {
  minprice=p.price;
  }
  }
  System.out.println("lowest cost product");
  
 for(product p:ps)
 {
 if(minprice==p.price)
 {
 System.out.println("product code :"+p.pcode);
  System.out.println("product name :"+p.pname);
   System.out.println("product name :"+p.price);
    }
    }
    }
    } 
              

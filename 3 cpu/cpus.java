
class Cpu{
   int price=40000;
   class processor{
     int noOfcores=5;
     String manufacture="Ryzen AMD";
       void display(){
              System.out.println("===PROCESSOR DETAILS===");
		System.out.println("---------------------");
              System.out.println("No of cores:"+noOfcores);
              System.out.println("Manufacture:"+manufacture);
          }
    }
    void display(){
        processor p=new processor();
         p.display();
         System.out.println("Price:"+price);
   }

    static class RAM{
       int memmory=8;
       String manufacture="nexgen rigs";
    void display(){
        System.out.println("\n===RAM DETAILS===");
        System.out.println("---------------------");
        System.out.println("Memmory:"+memmory);
        System.out.println("Manufacture:"+manufacture);
   }
 }
}
public class cpus{
   public static void main(String [] args){
       Cpu c1=new Cpu();
       c1.display();


     Cpu.RAM r1=new Cpu.RAM();
      r1.display();
}
}

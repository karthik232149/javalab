package arithmetic;
interface Addable{
public int add(int f, int s);
}
public class Addition implements Addable{
// returns sum of 2 numbers
public int add(int f, int s){
return f + s ;
}
}
package arithmetic;
interface Divisible{
public double div(int f, int s);
}
public class Division implements Divisible{
//returns result as double datatype
public double div(int f, int s){
return f / s ;
}
}
package arithmetic;
interface Multiplicable{
public int prod(int f, int s);
}
public class Multiplication implements Multiplicable{
// returns product of 2 numbers
public int prod(int f, int s){
return f * s ;
}
}
package arithmetic;
interface Multiplicable{
public int prod(int f, int s);
}
public class Multiplication implements Multiplicable{
// returns product of 2 numbers
public int prod(int f, int s){
return f * s ;
}
}
import java.util.Scanner;
import arithmetic.*;
class Operations{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number: ");
int f = sc.nextInt();
System.out.print("Enter the second number: ");
int s = sc.nextInt();
//Addtion
Addition a = new Addition();
System.out.println("Sum : " + a.add(f,s));
//Subtraction
Subtraction su = new Subtraction();
System.out.println("Difference : " + su.sub(f,s));
//Multiplication
Multiplication p = new Multiplication();
System.out.println("Product : " + p.prod(f,s));
//Division
Division d = new Division();
System.out.println("Division : " + d.div(f,s));
}
}
 
 
Find the average of N positive integers, raising a user defined exception for each negative input.
import java.util.Scanner;
class NegativeIntegerException extends Exception{
public NegativeIntegerException(String msg){
super(msg);
}
}
class Inputs{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of integers: ");
int l = sc.nextInt();
int sum = 0;
System.out.println("Enter the numbers:");
try{
for(int i=0; i<l; i++){
int num = sc.nextInt();
// Exception when number is negative
if(num < 0)
throw new NegativeIntegerException(num + " is negative, only positive integers are allowed!");
else {
sum += num;
}
}
//calculates average
double average = sum / l;
System.out.println("Average: "+ average);
} catch(NegativeIntegerException e){
e.printStackTrace();
}
}
}

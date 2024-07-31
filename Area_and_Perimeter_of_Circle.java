import java.util.Scanner;
public class Example {
public static void main(String[] args){
int a;
Scanner read = new Scanner(System.in);
a = read.nextInt();
double r,p;
r = 3.14*a*a;
p = 2*3.14*a;
System.out.printf("%.2f
",r);
System.out.printf("%.2f",p);
}
}
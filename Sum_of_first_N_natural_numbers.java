import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int sum = 0,size = read.nextInt();
        for(int i=0;i<=size;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
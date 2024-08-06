import java.util.Scanner;
    public class hours {
        public static void main(String args[]){
            Scanner read = new Scanner(System.in);
            int mins = read.nextInt();
            System.out.printf("%d Hour(s) %d Minute(s)",mins/60,mins%60);
    }
}
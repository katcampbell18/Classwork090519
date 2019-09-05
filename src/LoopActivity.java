import java.util.Scanner;

public class LoopActivity {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);

        int num, number, i, total=0;

        // Loop should start here
        System.out.println("Enter number of integers");
        num = keyboard.nextInt();
        for(i=1; i <= num; i++){
            System.out.println("Enter number" + i);
            number = keyboard.nextInt();
            total = total + number;
        }
        System.out.println("Sum of numbers are : " + total);
    }
}

import java.util.Scanner;
public class IfElse {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int time;
    
    System.out.println("Silahkan Masukkan jam: ");
    time = input.nextInt();

    if (time < 12) {
        System.out.println("good morning");
    } else if ( time < 15) {
        System.out.println("Good afternoon");
    } else {
        System.out.println("good night");; 

        input.close();
    }
    }
}
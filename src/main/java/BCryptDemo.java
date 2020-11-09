import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class BCryptDemo {
    public static void main(String[] args) {
        Scanner pwScanner = new Scanner(System.in);
        Scanner pwCheck = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = user.next();

        System.out.print("Enter a new password: ");
        String userInput = pwScanner.next();

        System.out.println("verify password: " );
        String checkPassword = pwCheck.next();

        if (checkPassword == userInput) {
            System.out.println("Welcome," + user);
        } else if (checkPassword != userInput){
            System.out.println("Intruder");
        }

    }

//        String password = "password123";
//        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
//        System.out.println(password);

//        boolean answer = BCrypt.checkpw(password, hash);
//        System.out.println(answer);
//        answer = BCrypt.checkpw("cats", hash);
//        System.out.println(answer);

}

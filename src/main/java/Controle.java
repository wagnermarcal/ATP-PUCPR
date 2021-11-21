import java.util.Scanner;

public class Controle {
    public static final Scanner scan = new Scanner(System.in);

    public static String leString(){
        return scan.nextLine();
    }

    public static int leInteiro(){
        return scan.nextInt();
    }
}

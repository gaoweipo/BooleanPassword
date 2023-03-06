import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le passeword de 6 nombres:");
        int password = sc.nextInt();
        boolean resultat = (password == 123456);
        System.out.println("password is correct:" + resultat);
        sc.close();
    }
}
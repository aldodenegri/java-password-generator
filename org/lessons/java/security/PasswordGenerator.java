import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String nome;
        String cognome;
        String colore_preferito;
        int[] data_di_nascita = new int[3];
        String password;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digita il tuo nome ");
            nome = in.nextLine();
            System.out.println("Digita il tuo cognome ");
            cognome = in.nextLine();
            System.out.println("Digita il tuo colore preferito ");
            colore_preferito = in.nextLine();
            System.out.println("Digita il giorno in cui sei nato ");
            data_di_nascita[0] = in.nextInt();
            System.out.println("Digita il mese in cui sei nato ");
            data_di_nascita[1] = in.nextInt();
            System.out.println("Digita il'anno in cui sei nato ");
            data_di_nascita[2] = in.nextInt();
        }


        password = nome + "-" + cognome + "-" + colore_preferito + "-" + data_di_nascita[2];
        
        System.out.printf("Password generata: %s%n", password);
    }
}

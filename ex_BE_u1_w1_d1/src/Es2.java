import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci la stringa 1: ");
        String str1 = sc.nextLine();


        System.out.println("Inserisci la stringa 2: ");
        String str2 = sc.nextLine();

        System.out.println("Inserisci la stringa 2: ");
        String str3 = sc.nextLine();

        System.out.println("L'insieme delle tue stringe dalla prima all'ultima è:: " + str1 + str2 + str3);
        System.out.println("L'insieme delle tue stringe dall'ultima alla prima è:: " + str3 + str2 + str1);

    }


}

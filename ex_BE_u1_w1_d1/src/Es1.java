import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {
        int product = multip(4, 6);
        System.out.println("Il risultato della moltiplicazione è: " + product);

        String concatString = conc("ciao", 3);
        System.out.println("La stringa concatenata è: " + concatString);

        String[] myArray = {"banana", "mela", "pera", "arancia", "ciliegia"};
        System.out.println("myString: " + Arrays.toString(myArray));

        String[] myNewArray = addToArray(myArray, "uva");
        System.out.println("myNewString: " + Arrays.toString(myNewArray));


    }

    private static int multip(int num1, int num2) {
        return num1 * num2;
    }

    private static String conc(String a, int b) {
        return a + b;
    }

    private static String[] addToArray(String[] array, String stringa) {
        String[] newArr = new String[6];
        newArr[0] = array[0];
        newArr[1] = array[1];
        newArr[2] = stringa;
        newArr[3] = array[2];
        newArr[4] = array[3];
        newArr[5] = array[4];

        return newArr;
    }

}


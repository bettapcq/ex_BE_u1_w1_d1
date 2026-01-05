public class Es3 {


    public static void main(String[] args) {
        double perimetro = perimetroRettangolo(4.5, 7.2);
        System.out.println("il perimetro è: " + perimetro);
        int pariODisp1 = pariDispari(7);
        System.out.println("0 se pari, 1 se dipari: " + pariODisp1);
        int pariODisp2 = pariDispari(10);
        System.out.println("0 se pari, 1 se dipari: " + pariODisp2);

        double areaTriangolo = perimetroTriangolo(2.3, 7.1, 4.9);
        System.out.println("l'area del triangolo è: " + areaTriangolo);
    }

    private static double perimetroRettangolo(double latoA, double latoB) {
        return (latoA + latoB) * 2;
    }

    private static int pariDispari(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private static double perimetroTriangolo(double latoA, double latoB, double latoC) {
        double p = (latoA + latoB + latoC) / 2.0;
        double areaT = Math.sqrt(p * (p - latoA) * (p - latoB) * (p - latoC));
        return areaT;
    }
}

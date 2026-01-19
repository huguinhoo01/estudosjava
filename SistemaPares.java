public class SistemaPares {
    public static void main(String[] args) {
        int [] paresImpares = { 2, 3, 9, 1, 13, 12, 34, 12, 4 };

        for (int i = 0; i < paresImpares.length; i++) {
            if(paresImpares[i] % 2 == 0) {
                System.out.println("" + paresImpares[i] + "É par!");
            } else {
                System.out.println("" + paresImpares[i] + "É impar!");
            }
        }
    }
}

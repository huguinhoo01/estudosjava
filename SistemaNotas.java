public class SistemaNotas {
    public static void main(String[] args) {
        double [] notas = { 7.6, 6.1, 9.0, 2.1, 1, 4.1, 6.4 };
        double maiorNota = 0;
        double menorNota = 0;
        double soma = 0;

        for(int i = 0; i < notas.length; i ++) {
            soma += notas[i];

            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }

            if(notas[i] < menorNota) {
                menorNota = notas[i];
            }

            double mediaDaTurma = (double) soma / notas.length;

            System.out.println("Média da turma: " + mediaDaTurma + "");
            System.out.println("Maior nota da turma: " + maiorNota + "");
            System.out.println("Menor nota da turma: " + menorNota + "");

            System.out.println("Notas acima da média: ");
            for(double nota : notas) {
                if(nota > mediaDaTurma) {
                    System.out.println(nota);
                }
            }
        }
    }
}

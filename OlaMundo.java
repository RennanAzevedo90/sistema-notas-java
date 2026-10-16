import java.util.Scanner; // Importamos o leitor de teclado

public class OlaMundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Criamos o armário vazio com 4 gavetas
        double[] notasDaSala = new double[4];

        System.out.println("=== SISTEMA DE CADASTRO DE NOTAS ===");

        // 1. PRIMEIRO LOOP: Preenche o armário usando o teclado
        for (int i = 0; i < notasDaSala.length; i++) {
            System.out.print("Digite a nota do aluno número " + i + ": ");
            notasDaSala[i] = teclado.nextDouble(); // Guarda o que você digitar na gaveta atual
        }

        // 2. SEGUNDO LOOP: Passa somando tudo o que foi digitado
        double soma = 0.0;
        for (int i = 0; i < notasDaSala.length; i++) {
            soma = soma + notasDaSala[i];
        }

        // Calculamos a média final da turma
        double mediaGeral = soma / notasDaSala.length;

        System.out.println("\n--- RESULTADO FINAL DA TURMA ---");
        System.out.println("A soma de todas as notas é: " + soma);
        System.out.println("A média geral da turma é: " + mediaGeral);

        teclado.close();
    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //o do while garante que sera feita uma nova tentativa caso haja a exceçao prevista
        do {
            System.out.println("Digite o primeiro valor: ");
            int valor1 = leitor.nextInt();

            System.out.println("Digite o segundo valor: ");
            int valor2 = leitor.nextInt();

            try {
                contar(valor1, valor2);
                break;
            } catch (ParametrosInvalidosException exception) {
                System.out.println("O primeiro valor deve ser MENOR que o segundo! Tente novamente");
            }
        }while(true);
    }
    static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
        if (valor1 > valor2)
            throw new ParametrosInvalidosException();

        int contagem = valor2 - valor1;

        for (int i = 1; i <= contagem ; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}

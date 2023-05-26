import java.util.Scanner;

class ValorNegativoException extends Exception {
    @Override
    public String toString() {
        return "Não é possível realizar um saque ou depósito de valor negativo.";
    }
}

public class Exemplo2Throws {
    public static void realizarSaque(double valor) throws ValorNegativoException {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        // Code for performing the withdrawal
        System.out.println("Saque realizado com sucesso.");
    }

    public static void realizarDeposito(double valor) throws ValorNegativoException {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        // Code for performing the deposit
        System.out.println("Depósito realizado com sucesso.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;

        try {
            System.out.print("Digite o valor para saque: ");
            valor = scanner.nextDouble();
            realizarSaque(valor);
        } catch (ValorNegativoException exception) {
            System.out.println("Exception: " + exception);
        }

        try {
            System.out.print("Digite o valor para depósito: ");
            valor = scanner.nextDouble();
            realizarDeposito(valor);
        } catch (ValorNegativoException exception) {
            System.out.println("Exception: " + exception);
        }
    }
}
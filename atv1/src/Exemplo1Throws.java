import java.util.Scanner;
public class Exemplo1Throws {
    public static int quociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continuaLoop = true;
        int numerador, denominador, resultado;
        do {
            try{
                System.out.print("Entre com um numerador inteiro: ");
                numerador = scanner.nextInt();
                System.out.print("Entre com um denominador inteiro: ");
                denominador = scanner.nextInt();
                
                resultado = quociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                continuaLoop = false;
            }
            catch (ArithmeticException arithmeticException){
                System.out.printf("\nExceptiion: %s", arithmeticException);
                System.out.println("\nZero é um denominador inválido! Por favor, digite novamente.");
                System.out.println();
            }
        }while (continuaLoop);
    }
}
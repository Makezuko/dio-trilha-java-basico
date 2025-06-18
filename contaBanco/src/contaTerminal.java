import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da sua conta: ");

        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o seu saldo atual: ");

        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque.", nomeCliente, nomeAgencia, numeroConta, saldo);

        scanner.close();
    }
}
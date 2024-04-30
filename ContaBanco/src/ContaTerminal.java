import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindx ao Banco Dig!");
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scan.next();

        System.out.println("Por favor, digite o Saldo da Conta: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco Dig, sua agência é "+ agencia +
                ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}

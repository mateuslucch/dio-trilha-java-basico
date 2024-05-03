import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String codigoAgencia;
        String nomeCliente;
        double saldoDisponivel = 100d;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        codigoAgencia = scanner.next();
        System.out.println("Por favor, digite o número da conta!");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + codigoAgencia + ", conta " + numeroConta + " e seu saldo " + saldoDisponivel
                + " já está disponível para saque.");

        scanner.close();
    }
}

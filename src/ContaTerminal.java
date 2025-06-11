import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeConta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Digite o número da conta:");
        Scanner scanner = new Scanner(System.in);
        numeConta = scanner.nextInt();

        System.out.println("Informe o número da agencia:");
        agencia = scanner.next();

        System.out.println("Informe o nome do titular:");
        nomeCliente = scanner.next();

        System.out.println("Informe o saldo da conta:");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo é %f",nomeCliente, agencia, numeConta, saldo);

    }
}
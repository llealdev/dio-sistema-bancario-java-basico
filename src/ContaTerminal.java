import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- BITBANK ----------");
        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Agência: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Informe o saldo: R$");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por ter criado uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

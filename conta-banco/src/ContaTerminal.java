import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite seu Nome: ");
        String nomeCliente = scanner.nextLine() + scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo));
    }
}

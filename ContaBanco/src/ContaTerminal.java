import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: Criar uma classe Conta terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digita seu nome! ");
        //String nomeCliente = scanner.next();
        String nomeCliente = scanner.next();

        System.out.println("Digita o numero da agencia! ");
        String agencia = scanner.next();

        System.out.println("Conta numero ? ");
        int contaNumero = scanner.nextInt();

        System.out.println("Digite seu saldo !");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo R$" + saldoConta + " já esta disponível para saque");

    }

}

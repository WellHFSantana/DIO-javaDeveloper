import java.util.Scanner;
import java.util.Locale;

public class ContaTerminalJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        int numero  = sc.nextInt();

        System.out.println("Por favor, agora digite o número da agência!");
        String agencia = sc.next();

        System.out.println("Estamos quase lá, agora precisamos do seu nome, por favor digite-o!");
        String nomeCliente = sc.next();

        System.out.println("E para finalizar, digite o seu saldo!");
        Double saldo = sc.nextDouble();

        System.out.println("Olá cliente "+ nomeCliente + " obrigado por criar uma conta em nosso banco! Sua agência é: " + agencia + " sua conta é: " + numero + " e o seu saldo " + saldo  + " já está disponível para saque.");

    }
}

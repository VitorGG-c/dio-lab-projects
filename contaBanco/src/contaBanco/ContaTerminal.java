package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numero;
		String agencia, nomeDoCliente;
		double saldo;
		System.out.print("Por favor, digite o nome do cliente: ");
		nomeDoCliente = sc.nextLine();
		sc.nextLine();
		System.out.print("Por favor, digite a agência: ");
		agencia = sc.next();
		System.out.print("Digite o número do cliente: ");
		numero = sc.nextInt();
		System.out.print("Saldo de abertura da conta: ");
		saldo = sc.nextDouble();
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco%n"
				+ "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeDoCliente, agencia, numero, saldo);
		sc.close();
	}

}

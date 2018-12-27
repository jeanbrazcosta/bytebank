package bytebank;

public class CriaConta {

	public static void main(String[] args) {
Conta primeiraConta = new Conta();
primeiraConta.saldo = 200;
System.out.println("meu saldo atual é:" + primeiraConta.saldo);
primeiraConta.saca(50);
System.out.println("O saldo após sacar é de:" + primeiraConta.saldo);
	}

}

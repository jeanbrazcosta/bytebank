package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulo Silveira";
		paulo.cpf = "2222223204";
		paulo.profissao = "programador";
Conta primeiraConta = new Conta();
primeiraConta.saldo = 200;
primeiraConta.
System.out.println("meu saldo atual é:" + primeiraConta.saldo);
primeiraConta.saca(50);
System.out.println("O saldo após sacar é de:" + primeiraConta.saldo);
Conta contaDaMarcela = new Conta();
contaDaMarcela.deposita(1000);
contaDaMarcela.transfere(50, primeiraConta);
System.out.println("Agora a conta da marcela tem" + contaDaMarcela.saldo);
System.out.println("E a primeira conta tem" + primeiraConta.saldo);
	}

}

package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca (double valor) {
		
		if(this.saldo >= this.valor) {
			this.saldo=this.saldo - valor;
			returne true;
		} else {
			returne false;
		}
	}
}

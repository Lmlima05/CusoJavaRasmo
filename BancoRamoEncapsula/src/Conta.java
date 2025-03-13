public class Conta {

  private int agencia;
  private int numero;
  private Cliente titular;
  private double saldo;
  private static int total;

  public Conta(int agencia, int numero, Cliente titular) {
    this.agencia = agencia;
    this.numero = numero;
    this.titular = titular;

    Conta.total++;
  }

  void depositar(double valor) {
    this.saldo += valor;
  }

  public boolean sacar(double valor){
    if(this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public void transferir(double valor, Conta destino) {
    boolean conseguiuSacar = this.sacar(valor);

    if(conseguiuSacar) {
      destino.depositar(valor);
    }

    }

  public double getSaldo() {
    return this.saldo;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if(agencia > 0) {
      this.agencia = agencia;
    }
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }

}


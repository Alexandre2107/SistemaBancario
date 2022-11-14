public class ContaCorrente {
  // Conta corrente: Não tem nenhum rendimento, saques ilimitados, taxa mensal de
  // manutenção de 5 reais.
  
  private double rendimento;
  private double valor;
  private double taxaMensal;

  public ContaCorrente() {

  }

  public void saque(double valor) {

    if (valor <= 0) {
      System.out.println("Favor, Sacar um valor positivo!");
    }
    if (this.valor < valor) {
      System.out.println("Não foi possível sacar essa quantia, pois o valor atual é de: " + this.valor);
    } else {
      this.valor -= valor;
    }

  }

  public void deposito(double valor) {
    if (valor <= 0) {
      System.out.println("Favor, Depositar um valor positivo!");
    } else {
      this.valor += valor;
    }

  }

}

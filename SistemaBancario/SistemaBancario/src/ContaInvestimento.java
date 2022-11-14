public class ContaInvestimento extends ContaGeral {
  // Conta Investimento: Rendimento de 1,3% ao mês, cada saque custa 25 reais,
  // taxa mensal de manutenção de 10 reais.

  public ContaInvestimento(String nome, double valor) {

    super(nome, valor);
  }

  @Override
  public void saque(double valor) {

    this.valor -= 25.00;

    if (this.valor < valor) {
      System.out.println("Não foi possível sacar essa quantia, pois o valor atual é de: " + this.valor);
    } else if (valor <= 0) {
      System.out.println("Favor, Sacar um valor positivo!");
    } else {
      this.valor -= valor;
    }

  }

  @Override
  public void passouMes() {
    this.valor += (valor - 10) * 0.013;
  }

}

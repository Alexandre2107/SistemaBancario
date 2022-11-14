public class ContaGeral {

    protected String nome;
    protected double valor;

    public ContaGeral(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
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

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void passouMes() {

        System.out.println("Passou o mês.");

    }

}
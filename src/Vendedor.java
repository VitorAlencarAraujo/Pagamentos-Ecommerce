public class Vendedor extends Funcionario{

    //Atributo único
    public float valorVendido;

    public Vendedor(String nome, String cpf, float salario, float valorVendido) {
        super(nome, cpf, salario);
        this.valorVendido = valorVendido;
    }

    @Override
    public float calcularBonificacao() {
        return 5/100f;
    }

    @Override
    public float calcularComisao() {
        return this.valorVendido * 5/100;
    }

    @Override
    public float calcularRemuneracaoTotal() {
        return getSalario() + (getSalario() * calcularBonificacao()) + calcularComisao();
    }

    public String toString(){
        return "Vendedor";
    }


}

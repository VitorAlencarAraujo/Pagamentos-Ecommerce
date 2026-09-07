public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    @Override
    public float calcularBonificacao() {
        return 10/100f;
    }

    @Override
    public float calcularRemuneracaoTotal() {
        return getSalario() + (getSalario() * calcularBonificacao());
    }

    public String toString(){
        return "Desenvolvedor";
    }

    @Override
    public float calcularComisao() {
        return 0;
    }
}

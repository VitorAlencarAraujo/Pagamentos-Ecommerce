public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    @Override
    public float calcularBonificacao() {
         return 20/100f;
    }

    @Override
    public float calcularRemuneracaoTotal() {
       return getSalario() + (getSalario() * calcularBonificacao());
    }

    public String toString(){
        return "Gerente";
    }

    @Override
    public float calcularComisao() {
        return 0;
    }
}

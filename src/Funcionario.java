public abstract class Funcionario {

    //Atributos
    private String nome;
    private String cpf;
    private float salario;

    //Construtor
    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Métodos
    public float getSalario() {
        return salario;
    }

    public abstract float calcularComisao();

    public abstract float calcularBonificacao();

    public abstract float calcularRemuneracaoTotal();

    public void exibirHolerite(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Cargo: " + toString());
        System.out.println("Sálario: " + this.salario);
        System.out.println("Bonificação: " + this.salario * calcularBonificacao());
        System.out.println("Comissão: " + calcularComisao());
        System.out.println("Remuneração Total: " + calcularRemuneracaoTotal());
    }
}

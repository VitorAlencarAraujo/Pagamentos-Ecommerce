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

    public abstract float calcularBonificacao();
    public abstract float calcularRemuneracaoTotal();

    public abstract float calcularComisao();

    //Metodo para exibir o Holerite
    public void exibirHolerite(){

        // VAIDAÇÃO NOME
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("\nNome: O nome precisa ser informado!!!");
        } else {
            System.out.println("\nNome: " + this.nome);
        }

        // VAIDAÇÃO CPF
        if (cpf == null || cpf.trim().isEmpty()) {
            System.out.println("CPF: O cpf precisa ser informado!!!");
        } else {
            System.out.println("CPF: " + this.cpf);
        }
        System.out.println("Cargo: " + toString());

        // VAIDAÇÃO SALÁRIO
        if (salario <=0){
            System.out.println("Salário: Salário não pode ser menor ou igual a 0!!!");
        } else {
            System.out.println("Salário: " + this.salario);
        }

        // VALIDAÇÃO BONIFICAÇÃO
        if (this.salario * calcularBonificacao() <0 ){
            System.out.println("Bonificação: Bonificação não pode ser menor ou igual a 0!!!");
        } else {
            System.out.println("Bonificação: " + this.salario * calcularBonificacao());
        }

        // VALIDAÇÃO COMISSÃO
        if (calcularComisao() < 0){
            System.out.println("Comissão: Comissão não pode ser menor ou igual a 0!!!");
        } else {
            System.out.println("Comissão: " + calcularComisao());
        }

        // VALIDAÇÃO REMUNERAÇÃO TOTAL
        if (calcularRemuneracaoTotal() <=0){
            System.out.println("Remuneração Total: -ERRO-" );
        } else {
            System.out.println("Remuneração Total: " + calcularRemuneracaoTotal());
        }
    }
}

void main(){

    Gerente gerente = new Gerente(
            "Mariana",
            "52102288862",
            10000.0f
    );
    Desenvolvedor desenvolvedor = new Desenvolvedor(
            "Carlos Lima",
            "7231044489",
            7000.0f
    );
    Vendedor vendedor = new Vendedor(
            "Vitor",
            "29435987698",
            4000.0f,
            1200.0f
    );

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    funcionarios.add(gerente);
    funcionarios.add(desenvolvedor);
    funcionarios.add(vendedor);

    for (Funcionario funcionario : funcionarios){
        funcionario.exibirHolerite();
    }
}
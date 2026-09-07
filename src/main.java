void main(){
    System.out.println("\n============================================");
    System.out.println("INSTANCIANDO FUNCIONARIOS COM DADOS VALIDOS");
    System.out.println("============================================");
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

    //-Array- que contem todos os funcionarios
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    funcionarios.add(gerente);
    funcionarios.add(desenvolvedor);
    funcionarios.add(vendedor);

    //-For- que percorre o Array
    for (Funcionario funcionario : funcionarios){
        funcionario.exibirHolerite();
    }

    // TOTAL DA FOLHA
    float totalFolha = 0;

    for (Funcionario funcionario : funcionarios) {
        totalFolha += funcionario.calcularRemuneracaoTotal();
    }

    System.out.println("\n============================================");
    System.out.println("Total da folha: " + totalFolha);
    System.out.println("============================================");

    System.out.println("\n============================================");
    System.out.println("INSTANCIANDO FUNCIONARIOS COM DADOS VALIDOS");
    System.out.println("============================================");

    Gerente gerente2 = new Gerente(
            "",
            "52102288862",
            10000.0f
    );
    Desenvolvedor desenvolvedor2 = new Desenvolvedor(
            "Carlos Lima",
            "",
            7000.0f
    );
    Vendedor vendedor2 = new Vendedor(
            "Vitor",
            "29435987698",
            -4000.0f,
            -1200.0f
    );

    ArrayList<Funcionario> funcionariosInvalidos = new ArrayList<>();

    funcionariosInvalidos.add(gerente2);
    funcionariosInvalidos.add(desenvolvedor2);
    funcionariosInvalidos.add(vendedor2);

    //-For- que percorre o Array
    for (Funcionario funcionario : funcionariosInvalidos){
        funcionario.exibirHolerite();
    }

    float totalFolha2 = 0;

    for (Funcionario funcionario : funcionariosInvalidos) {
        totalFolha2 += funcionario.calcularRemuneracaoTotal();
    }

    System.out.println("\n============================================");
    System.out.println("Total da folha: " + totalFolha2);
    System.out.println("============================================");
}
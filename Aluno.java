class Aluno
{
    private String nome;
    private String curso;
    private int matricula;
    private Maquina[] carrinho;
    private int qtd;

    public Aluno(String nome, String curso, int matricula, int max)
    {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        carrinho = new Maquina[max];
        qtd = 0;
    }

    public void adicionar(Maquina m)
    {
        carrinho[qtd] = m;
        qtd++;
    }

    public Maquina[] getCarrinho()
    {
        return carrinho;
    }

    public void resumo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matricula: " + matricula);
        float soma = 0;
        for (int i = 0; i < qtd; i++)
        {
            carrinho[i].mostrar();
            soma += carrinho[i].getValor();
        }
        System.out.println("Total final: R$" + soma);
    }
}
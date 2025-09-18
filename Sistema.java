class Sistema
{
    private String nome;
    private int bits;

    public Sistema(String nome, int bits)
    {
        this.nome = nome;
        this.bits = bits;
    }

    public String exibir()
    {
        return nome + " (" + bits + " bits)";
    }
}
class ConfigBasica
{
    private String tipo;
    private int valor;

    public ConfigBasica(String tipo, int valor)
    {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String exibir()
    {
        return tipo + ": " + valor;
    }
}
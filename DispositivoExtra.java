class DispositivoExtra
{
    private String modelo;
    private int tamanho;

    public DispositivoExtra(String modelo, int tamanho)
    {
        this.modelo = modelo;
        this.tamanho = tamanho;
    }

    public String exibir()
    {
        return modelo + " " + tamanho + "Gb";
    }
}
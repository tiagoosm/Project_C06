class Maquina
{
    private String fabricante;
    private float valor;
    private ConfigBasica[] pecas;
    private Sistema sistema;
    private DispositivoExtra extra;

    public Maquina(String fabricante, float valor, ConfigBasica[] pecas, Sistema sistema, DispositivoExtra extra)
    {
        this.fabricante = fabricante;
        this.valor = valor;
        this.pecas = pecas;
        this.sistema = sistema;
        this.extra = extra;
    }

    public float getValor()
    {
        return valor;
    }

    public void mostrar()
    {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Preco: R$" + valor);
        for (ConfigBasica p : pecas)
        {
            System.out.println(p.exibir());
        }
        System.out.println("SO: " + sistema.exibir());
        System.out.println("Brinde: " + extra.exibir());
        System.out.println();
    }
}
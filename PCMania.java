import java.util.Scanner;

public class PCMania
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int matricula = 9876;

        Maquina m1 = new Maquina(
            "Apple",
            matricula,
            new ConfigBasica[] {
                new ConfigBasica("Processador i3", 2200),
                new ConfigBasica("RAM", 8),
                new ConfigBasica("HD", 500)
            },
            new Sistema("macOS Sequoia", 64),
            new DispositivoExtra("Pendrive", 16)
        );

        Maquina m2 = new Maquina(
            "Samsung",
            matricula + 1234,
            new ConfigBasica[] {
                new ConfigBasica("Processador i5", 3370),
                new ConfigBasica("RAM", 16),
                new ConfigBasica("HD", 1000)
            },
            new Sistema("Windows 8", 64),
            new DispositivoExtra("Pendrive", 32)
        );

        Maquina m3 = new Maquina(
            "Dell",
            matricula + 5678,
            new ConfigBasica[] {
                new ConfigBasica("Processador i7", 4500),
                new ConfigBasica("RAM", 32),
                new ConfigBasica("HD", 2000)
            },
            new Sistema("Windows 10", 64),
            new DispositivoExtra("HD Externo", 1000)
        );

        Aluno cliente = new Aluno("Carlos", "Engenharia", matricula, 10);

        int opcao;
        do
        {
            System.out.println("Digite 1, 2, 3 para escolher a promocao ou 0 para finalizar:");
            opcao = entrada.nextInt();
            if (opcao == 1) cliente.adicionar(m1);
            else if (opcao == 2) cliente.adicionar(m2);
            else if (opcao == 3) cliente.adicionar(m3);
        }
        while (opcao != 0);

        cliente.resumo();
        Enviar.confirmar(cliente.getCarrinho());

        entrada.close();
    }
}
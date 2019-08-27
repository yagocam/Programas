import java.util.Scanner;

public class Matriz
{
    public static void main(String[] args)
    {

       Scanner dado = new Scanner (System.in);
        System.out.print("Informe o número de linhas");
        int linha = dado.nextInt();
        System.out.print("Informe o número de colunas ");
        int coluna = dado.nextInt();
        int [][]matriz = new int [linha][coluna];
        for (int i=0;i<linha;i++)
        {

            for(int v=0;v<coluna;v++)
            {
                System.out.print(matriz[i][v]+ " ");

            }
            System.out.println();


        }
        System.out.println();

        for (int i=0;i<linha;i++)
        {
            for(int v=0;v<coluna;v++)
            {
                System.out.print("Informe o valor da matriz["+i+"]["+v+"]:");
                int valor = dado.nextInt();
                matriz[i][v] = valor;
            }
        }
        System.out.println("Dados atualizados ");
                for (int i=0;i<linha;i++)
                {

                    for(int v=0;v<coluna;v++)
                    {
                        System.out.print(matriz[i][v]+ " ");

                    }
                    System.out.println();
                }


    }

}

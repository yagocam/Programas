package teste;

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner dado = new Scanner(System.in);
		System.out.println("Quantos filmes irá cadastrar?");
		int q = dado.nextInt();
		Filmes filmes[] = new Filmes[q];
		for(int i=0;i<q;i++) 
		{
			System.out.println("Qual o nome do filme?");
			String nome = dado.next();
			System.out.println("Qual o ano do filme?");
			int ano = dado.nextInt();
			String generos[] = new String[2];
			System.out.println("Qual o primeiro gênero?");
			generos[0] = dado.next();
			System.out.println("Qual o segundo gênero?");
			generos[1] = dado.next();
			
			filmes[i] = new Filmes(nome, ano , generos);
			}
		System.out.println("Filmes cadastrados : ");
		for(int i=0;i<q;i++) 
		{
			System.out.println(filmes[i]);
			System.out.println("----------------------PRÓXIMO----------------------");
			
			
		}
		
	}

}

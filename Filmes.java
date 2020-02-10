package teste;

import java.util.Arrays;

public class Filmes 
{
public String nome;
public int ano;
public String[] generos = new String[2];

public Filmes() 
{}
public Filmes(String n, int a,String[] g) 
{
setNome(n);
setAno(a);
setGeneros(g);

}
@Override
public String toString() {
	return "Filmes [nome=" + nome + ", ano=" + ano + ", generos=" + Arrays.toString(generos) + "]";
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String[] getGeneros() {
	return generos;
}
public void setGeneros(String[] generos) {
	this.generos = generos;
}


}

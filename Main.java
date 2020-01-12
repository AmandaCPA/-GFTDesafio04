package main;

import java.util.ArrayList;
import java.util.List;

import modulo.Livro;
import modulo.Loja;
import modulo.VideoGame;

public class Main {

	public static void main(String[] args) 
	{
		Livro l1 = new Livro ("Harry Potter", 40.0, 50, "JK Rowling", "Fantasia", 300);
		Livro l2 = new Livro ("Senhor dos Aneis", 60.0, 30, " J. R. R. Tolkien", "Fantasia", 500);
		Livro l3 = new Livro("Java Poo", 20.0, 50, "GFT", "Educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000.0, 7, "Sony", "Slim", true);
		VideoGame xBox = new VideoGame("Xbox", 1500.0, 500, "Microsoft", "One", true);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
	
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xBox);
		
		Loja americanas = new Loja ("Americanas", "123456/0001", livros, games);
		
		
//		l2.calculaImposto();
//		l3.calculaImposto();
		System.out.println("R$ " + l2.calculaImposto() + " de impostos sobre o livro " + l2.getNome());
		System.out.println("R$ " + l3.calculaImposto() + " de impostos sobre o livro " + l3.getNome());

		
		
//		ps4Usado.calculaImposto();
//		ps4.calculaImposto();
		System.out.println("R$ " + ps4Usado.calculaImposto() + " de impostos sobre o livro " + ps4Usado.getNome());
		System.out.println("R$ " + ps4.calculaImposto() + " de impostos sobre o livro " + ps4.getNome());
		
		
		System.out.println("----------------------------------------------------");
		
		
		System.out.println(americanas.getNome() + " possui estes livros para venda:");
		americanas.listaLivros();
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(americanas.getNome() + " possui estes vide-games para venda:");
		americanas.listaVideoGames();
//		americanas.calculaPatrimonio();
		
		System.out.println("----------------------------------------------------");
		
		
		System.out.println("Patrimonio da loja " + americanas.getNome() + " é de R$ " + americanas.calculaPatrimonio());

	}

}

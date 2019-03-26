package javatwitter;

import java.util.Scanner;

public class TestTweet {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o login:");
		String login = input.next();
		
		System.out.println("Entre com a senha:");
		String senha = input.next();
		Usuario usuario = new Usuario(login,senha);
		
		boolean tweeting = true;
		
		while(tweeting) {
			
			System.out.println("Entre com seu tweet");			
			String tweet = input.next();
			usuario.tweetar(tweet);
			
			System.out.println("Quer tweetar novamente ?");
			
			if(!input.next().equals("sim")) {
				tweeting = false;
			}		
			
		}
		
		usuario.listarTweets();

	}

}

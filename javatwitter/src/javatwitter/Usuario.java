package javatwitter;
import java.util.ArrayList;

public class Usuario {

	private String login;
	private String senha;
	
	private ArrayList<Tweet> tweets;
	
	public Usuario(String login, String senha) {
		this.tweets = new ArrayList<>();
		this.setLogin(login);
		this.setSenha(senha);
		if(!this.checkPass()) {
			System.out.println("Senha inválida");
			System.exit(0);
		}
	}
	
	private String getLogin() {
		return this.login;
	}
	private String getSenha() {
		return this.senha;
	}
	
	private void setLogin(String login) {
		this.login = login;
	}
	
	private void setSenha(String senha) {
		this.senha = senha;
	}
	
	private boolean checkPass() {
		if(this.getSenha().equals("poo")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void tweetar(String texto) {
		if(this.checkPass()) {
		Tweet tweet = new Tweet(texto);
		this.tweets.add(tweet);
		} else {
			System.out.println("A senha inserida é inválida, logo é impossível completar esse tweet");
			System.exit(0);
		}
	}
	
	public void listarTweets() {
		System.out.printf("Login: %s\n", this.getLogin());
		
		for(int i=0;i<this.tweets.size();i++) {
			System.out.println(this.tweets.get(i).getTweet());
		}
	}	
}

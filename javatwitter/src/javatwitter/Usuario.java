// Rafael Faustini - 0050014724
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
		if (!this.checkPass()) { // Primeira checagem de segurança, verifica se a senha está coreta
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
		if (this.getSenha().equals("poo")) {
			return true;
		} else {
			return false;
		}
	}

	public void tweetar(String texto) {
		if (this.checkPass()) {
			Tweet tweet = new Tweet(texto);
			this.tweets.add(tweet);
		} else {
			System.out.println("A senha inserida é inválida, logo é impossível completar esse tweet"); // Segunda checagem de segurança para se certificar de que não haverá tweets indevidos
			System.exit(0);
		}
	}

	public void listarTweets() {
		System.out.printf("\nLogin: %s\n\n", this.getLogin());

		for (int i = 0; i < this.tweets.size(); i++) {
			Tweet tweet = this.tweets.get(i);
			System.out.printf("@%s %s\n", this.getLogin(), tweet.getDataHora());
			System.out.println(tweet.getTweet());
		}
	}
}

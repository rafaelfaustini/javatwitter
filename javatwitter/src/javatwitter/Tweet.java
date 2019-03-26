package javatwitter;

public class Tweet {
	private String texto;
	
	public Tweet(String mensagem) {
		this.setTweet(mensagem);
	}
	
	private boolean canTweet(String mensagem) {
		if(!mensagem.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	private void setTweet(String mensagem) {
		if(canTweet(mensagem)) {
			this.texto = mensagem;
		}
	}
	public String getTweet() {
		return this.texto;
	}
}

// Rafael Faustini - 0050014724
package javatwitter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Tweet {
	private String texto;
	private Instant datahora;
	
	public Tweet(String mensagem) {
		if (mensagem.length() >= 140) {
			mensagem = mensagem.substring(0, 140);
		}

		if(this.setTweet(mensagem)) {
			this.datahora = Instant.now();
		}
		
	}

	private boolean canTweet(String mensagem) {
		if (!mensagem.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	private boolean setTweet(String mensagem) {
		if (canTweet(mensagem)) {
			this.texto = mensagem;
			return true;
		} else {
			return false;
		}
	}
	
	public String getDataHora() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT ).withLocale( Locale.getDefault() ).withZone( ZoneId.systemDefault() );
		return formatter.format(this.datahora);
	}

	public String getTweet() {
		return this.texto;
	}
}

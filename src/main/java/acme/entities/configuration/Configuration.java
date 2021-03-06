package acme.entities.configuration;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Configuration extends AbstractEntity{
	
private static final long	serialVersionUID	= 1L;
	
	
	@NotBlank
	String weakSpamWords;
	
	@NotBlank
	String strongSpamWords;
	
	@NotNull
	@Range(min = 0, max = 1)
	private Double strongSpamThreshold;
	
	@NotNull
	@Range(min = 0, max = 1)
	private Double weakSpamThreshold;
	
	
	public boolean isSpamWeak(final String text) {
		final String[] lowerCaseText = text.toLowerCase().replaceAll("\\s+", " ").split(" ");
		int spamCount = 0;
		final String[] sp = this.weakSpamWords.split(",");
		
		for (final String s : sp) {
			if (text.toLowerCase().trim().replaceAll("\\s+", " ").contains(s)) {
				spamCount++;
			}
			for (int i = 0; i < lowerCaseText.length; i++) {
				if (lowerCaseText[i].contains(s)) {
					spamCount++;
				}

			}
		}
		if (spamCount % 2 == 0) {
			spamCount = spamCount / 2;
		} else {
			spamCount = (spamCount / 2) + 1;
		}
		final Double umbral = (double) spamCount / lowerCaseText.length;

		return umbral > this.weakSpamThreshold;

	}
	
	public boolean isSpamStrong(final String text) {
		final String[] lowerCaseText = text.toLowerCase().replaceAll("\\s+", " ").split(" ");
		int spamCount = 0;
		final String[] sp = this.strongSpamWords.split(",");
		
		for (final String s : sp) {
			if (text.toLowerCase().trim().replaceAll("\\s+", " ").contains(s)) {
				spamCount++;
			}
			for (int i = 0; i < lowerCaseText.length; i++) {
				if (lowerCaseText[i].contains(s)) {
					spamCount++;
				}

			}
		}
		if (spamCount % 2 == 0) {
			spamCount = spamCount / 2;
		} else {
			spamCount = (spamCount / 2) + 1;
		}
		final Double umbral = (double) spamCount / lowerCaseText.length;

		return umbral > this.strongSpamThreshold;

	}

}

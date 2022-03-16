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

}

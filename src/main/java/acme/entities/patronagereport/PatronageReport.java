package acme.entities.patronagereport;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
public class PatronageReport extends AbstractEntity{
	
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;
	
	//Attributes
	
	@NotBlank
	@Pattern(regexp="(\\w{3})-(\\d{3})")
	protected String seqNumber;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	protected Date createdAt;
	
	@NotBlank
	@Length(min = 1, max = 255)
	protected String memorandum;
	
	@URL
	protected String link;
	
	//RelationShip
	//@ManyToOne
	//@Valid
	//protected Patronage patronage;

}

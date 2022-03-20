package acme.entities.tool;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.datatypes.Money;
import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Tool extends AbstractEntity {
	//Serialisation identifier  ---------------------------------------------
	
	protected static final long	serialVersionUID= 1L;
	
	// Attributes
	
	@NotBlank
	@Length(min = 1, max = 100)
	protected String name;

	@NotBlank
	@Length(min = 1, max = 100)
	protected String technology;
	
	@NotBlank
	@Column(unique=true)
	@Pattern(regexp = "^[A-Z]{3}-[0-9]{3}(-[A-Z])?$")
	protected String code;

	@NotBlank
	@Length(min = 1, max = 255)
	protected String description;

	@NotBlank
	protected Money retailprice;
	
	@URL
	protected String link;
	
	/*
	 @OnetoOne
	 @Valid
	 protected Toolkit toolkit;
	 */
}
package acme.entities.tool;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.UniqueElements;

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
	@Length(max = 100)
	protected String name;

	@NotBlank
	@Length(max = 100)
	protected String technology;
	
	@NotBlank
	@UniqueElements
	@Pattern(regexp = "^[A-Z]{3}-[0-9]{3}(-[A-Z])?$")
	protected String code;

	@NotBlank
	@Length(max = 255)
	protected String description;

	@NotBlank
	@Min(0)
	protected Double retailprice;
	
	@URL
	protected String link;
}
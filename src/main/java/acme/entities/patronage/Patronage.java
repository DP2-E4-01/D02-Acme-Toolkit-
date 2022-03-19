package acme.entities.patronage;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.entities.patronagereport.PatronageReport;
import acme.enums.Status;
import acme.framework.entities.AbstractEntity;
import acme.roles.Inventor;
import acme.roles.Patron;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patronage extends AbstractEntity {

	protected static final long serialVersionUID = 1L;
	
	public Inventor inventor;
	
	public Patron patron;
	
	public Status status;
	
	@Pattern(regexp = "^[A-Z]{3}-[0-9]{3}(-[A-Z])?$")
	@Column(unique=true)
	public String code;
	
	@NotBlank
	@Size(max = 255)
	public String legalStuff;
	 
	@Min(value = 0L)
	public Float budget;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date startsAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date finishesAt;
	
	@URL
	protected String link;
	
	@OneToMany
	public List<PatronageReport> reports;
	
}

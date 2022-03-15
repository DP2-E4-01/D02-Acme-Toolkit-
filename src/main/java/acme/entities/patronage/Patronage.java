package acme.entities.patronage;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import acme.enums.Status;
import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patronage extends AbstractEntity {

	protected static final long serialVersionUID = 1L;
	
	public Status status;
	
	public String code;
	
	public String legalStuff;
	 
	public Float budget;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date startsAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date finishesAt;
	
}

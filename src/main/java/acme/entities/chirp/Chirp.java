package acme.entities.chirp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "chirp")
public class Chirp extends AbstractEntity {


    // Serialisation identifier -----------------------------------------------

    protected static final long serialVersionUID = 1L;

    // Attributes -------------------------------------------------------------


    @Temporal(TemporalType.TIMESTAMP)
    @Past
    @NotNull
    protected Date creationTime;

    @NotBlank
    @Max(101)
    protected String author;

    @NotBlank
    @Max(101)
    protected String title;

    @NotBlank
    @Max(256)
    protected String body;

    @Email
    protected String email;


    // Derived attributes -----------------------------------------------------

    // Relationships ----------------------------------------------------------

}

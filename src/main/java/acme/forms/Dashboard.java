
package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double	totalNumberPatronagesPropose;
	Double	totalNumberPatronagesAccepted;
	Double	totalNumberPatronagesDenied;
	
	Double	averagePatronagesProposed;
	Double	averagePatronagesAccepted;
	Double	averagePatronagesDenied;
	
	Double	deviationPatronagesProposed;
	Double	deviationPatronagesAccepted;
	Double	deviationPatronagesDenied;
	
	Double	minimunBudgetPatronagesProposed;
	Double	minimunBudgetPatronagesAccepted;
	Double	minimunBudgetPatronagesDenied;
	
	Double	maximunBudgetPatronagesProposedCurr1;
	Double	maximunBudgetPatronagesAcceptedCurr1;
	Double	maximunBudgetPatronagesDeniedCurr1;
	
	Double	maximunBudgetPatronagesProposedCurr2;
	Double	maximunBudgetPatronagesAcceptedCurr2;
	Double	maximunBudgetPatronagesDeniedCurr2;
	
	Double	maximunBudgetPatronagesProposedCurr3;
	Double	maximunBudgetPatronagesAcceptedCurr3;
	Double	maximunBudgetPatronagesDeniedCurr3;


	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}

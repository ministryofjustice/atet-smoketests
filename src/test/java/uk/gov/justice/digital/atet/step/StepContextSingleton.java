package uk.gov.justice.digital.atet.step;

public class StepContextSingleton {

	private static StepContext stepContext;

	public static StepContext getInstance() {
		if (stepContext == null) {
			return stepContext = new StepContext();
		} else
			return stepContext;
	}

}

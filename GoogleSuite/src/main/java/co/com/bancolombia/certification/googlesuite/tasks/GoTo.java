package co.com.bancolombia.certification.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;;

public class GoTo implements Task{
	
	private Target googleApp;
	
	public  GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_CLOSE_EMERGENT_WINDOW));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),Click.on(googleApp));
		//actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
		
		
	}

	public static GoTo theApp(Target googleApp) {
		
		return instrumented(GoTo.class,googleApp); //instrumented va y buscar la clase goto, un constructor que reciba un target, lo llama y as� le otorga valor
		
	}


}
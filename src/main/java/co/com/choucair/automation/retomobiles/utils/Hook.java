package co.com.choucair.automation.retomobiles.utils;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}

package co.com.choucair.automation.retomobiles.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL_INPUT = Target.the
            ("input for write email").located(By.id(""));
    public static final Target EMAIL_BUTTON = Target.the
            ("button next email").located(By.id(""));
     public static final Target PASSWORD_INPUT = Target.the
            ("input for write password").located(By.id(""));
    public static final Target PASSWORD_BUTTON = Target.the
            ("button next password").located(By.id(""));

}

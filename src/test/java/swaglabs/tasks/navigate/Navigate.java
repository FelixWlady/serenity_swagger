package swaglabs.tasks.navigate;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheLoginPage(){
        return Open.url("https://www.saucedemo.com/");
    }
}

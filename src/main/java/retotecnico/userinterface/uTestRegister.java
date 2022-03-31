package retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegister extends PageObject {
    public static final Target REGISTER_BUTTON=Target.the("button that sends to the registration page").located(By.xpath("//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRSTNAME=Target.the("where enter the name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME=Target.the("where  enters the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("where  enters the email").located(By.id("email"));
    public static final Target INPUT_MONTH=Target.the("where  chooses the month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY=Target.the("where  chooses the day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR=Target.the("where  chooses the year").located(By.id("birthYear"));
    public static final Target ENTER_BUTTON=Target.the("button that sends to the next page").located(By.xpath("//div[@class='container-fluid']//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY=Target.the("where enter the city").located(By.id("city"));
    public static final Target INPUT_POSTAL=Target.the("where enter the postal code").located(By.id("zip"));
    public static final Target INPUT_COUNTRY=Target.the("where enter the country").located(By.xpath("//div[@class='uui-select-match']//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched ng-hide']"));
    public static final Target ENTER_BUTTON2=Target.the("button that sends to the next page").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));




}

package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class UtestSignUp  {
    public static final Target JOIN_BUTTON = Target.the("Buton show Join form")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME= Target.the("Were do we write the First Name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("Were do we write the Last Name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Were do we write the Email")
            .located(By.id("email"));
    public static final Target MONTH_LIST = Target.the("Were do we write the Month of birth")
            .located(By.id("birthMonth"));
    public static final Target DAY_LIST = Target.the("Were do we write the Day of birth")
            .located(By.id("birthDay"));
    public static final Target YEAR_LIST = Target.the("Were do we write the Year of birth")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE = Target.the("Were do we write the languages he speaks")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_PAGE  = Target.the("Were do we write the languages he speaks")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target  SELECT_LANG = Target.the("Button to navegate")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span/div"));

    //Second Page
    public static final Target CITY_INPUT = Target.the("Were do we write the City Location")
            .located(By.id("city") );
    public static final Target POSTAL_CODE_INPUT = Target.the("Were do we write the City Location")
            .located(By.id("zip") );
    public static final Target COUNTRY_LIST = Target.the("Were do we write the Country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]"));
    public static final Target IMPUT_COUNTRY= Target.the("Were do we write the Country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SELECT_COUNTRY= Target.the("Were do we write the Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[3]/span"));
    public static final Target NEXT_PAGE_DEVICES = Target.the("Were do we write the Country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    //Third Page
    public static final Target BRAND_LIST = Target.the("Were do click the Brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target IMPUT_BRAND= Target.the("Were do we write the brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_BRAND= Target.the("Were do select the brand")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[3]/span/div"));

    public static final Target MODEL_LIST = Target.the("Were do click the Model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target IMPUT_MODEL= Target.the("Were do we write the Model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_MODEL= Target.the("Were do select the Model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[3]/span/div"));

    public static final Target OS_LIST = Target.the("Were do click the Model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_OS= Target.the("Were do select the Model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));

    public static final Target NEXT_LAST = Target.the("Were do click the Next Button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));


}



package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EndRegisterPage  {

    public static final Target  INPUT_PASSWORD= Target.the("Write the Password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm the Password")
            .located(By.id("confirmPassword"));
    public static final Target ACCEPT_TERMS = Target.the("Accept the terms of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_PRIVACY = Target.the("Accept the terms of Privacy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
  /*  public static final Target FINISH_BUTTON = Target.the("Finish Page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div/div"));*/
    public static final Target VALIDATION = Target.the("Validation Text")
            .located(By.xpath("//*[@id=\"side_banner\"]/div[2]/div[1]"));

}

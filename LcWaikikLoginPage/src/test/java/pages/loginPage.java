package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class loginPage {
    WebDriver driver;
    WebDriverWait wait;
    //elementlerimiz.
    By clicckCard=By.id("user_1_");
    By checkLoginPage=By.cssSelector(".login-form__title");
    By clikckRadiobtnposta=By.cssSelector(".login-form__radio-buttons--first-label .login-form__radio-buttons--span");
    By clikckRadiobtnphone=By.cssSelector(".login-form__radio-buttons--second-label .login-form__radio-buttons--span");
    By checkTitle=By.cssSelector(".login-form__title");
    By checkTextEmail=By.name("email");
    By checkTextPassword=By.name("password");
    By checkRadiobtnpsta=By.cssSelector(".login-form__radio-buttons--span");
    By checkPasswordShow=By.cssSelector(".login-form__show-password-icon--img");
    By checkRemember=By.cssSelector(".checkbox-span");
    By checkForgetPassword=By.cssSelector(".login-form__forgot-password-link");
    By checkLoginbtn=By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By checkPhoneText=By.cssSelector(".login-form__phone.text-input");
    By checkMailEmpty=By.cssSelector(".input-container .error");
    By checkPasswordEmpty=By.cssSelector(".login-form__password .error");
    By checkFalseLogin=By.cssSelector(".login-form__header-errors--p");
    By clickLoginbtn=By.cssSelector(".login-form__button.login-form__button--bg-blue");
        public loginPage (WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
    }
    //login penceresi kontrolu
    public void checkLoginPage(){
        driver.findElement(clicckCard).click();
        driver.findElement(checkLoginPage);
    }
    //radio buton kontrolu
    public void clickRadiobtn(String text){
        String str=driver.findElement(clikckRadiobtnposta).getText();
        String str2=driver.findElement(clikckRadiobtnphone).getText();
        if(text.contains(str)) {
            driver.findElement(clikckRadiobtnposta).click();
        }
        if(text.equals(str2)) {
            driver.findElement(clikckRadiobtnphone).click();
        }
    }
    //ba??l??k kontrol??
    public void checkTitle(String title){
        String str=driver.findElement(checkTitle).getText();
        Assert.assertEquals(str,title);
    }
    //radio buton kontrolu
    public void checkRadiobtn(String text){
        String str=driver.findElement(checkRadiobtnpsta).getText();
    }
    public void checkMail(String text){
        String str=driver.findElement(checkTextEmail).getAttribute("placeholder");
        Assert.assertEquals(str,text);
    } //??ifre giri?? kontrolu
    public void checkPassword(String text){
        String str=driver.findElement(checkTextPassword).getAttribute("placeholder");
        Assert.assertEquals(str,text);
    } //??ifre g??sterme ikonu kontrolu
    public void checkShowPassword(){
        driver.findElement(checkPasswordShow);
    }
    // beni hat??rla ikonu kontrolu
    public void checkRemember(String text){
        String str=driver.findElement(checkRemember).getText();
        Assert.assertEquals(str,text);
    } //??ifrem?? unuttum mesaj?? kontorlu
    public void checkForgetPassword(String text){
        String str=driver.findElement(checkForgetPassword).getText();
        Assert.assertEquals(str,text);
    }
    //login butonu kontrolu
    public void checkLoginbtn(String text){
        String str=driver.findElement(checkLoginbtn).getText();
        Assert.assertEquals(str,text);
    }
    //telefon mesaj?? kontrolu
    public void checkPhoneText(){
        driver.findElement(checkPhoneText);
    }
    //login butonuna t??klama
    public void clickLoginbtn(){
        driver.findElement(checkLoginbtn).click();
    }
    //mail bo?? mesaj?? kontrolu
    public void checkEmailEmptymessage(String text){
        String str=driver.findElement(checkMailEmpty).getText();
        Assert.assertEquals(str,text);
    }
    //??ifre bo?? mesaj?? kontrolu
    public void checkPasswordEmptyMassage(String text){
        String str=driver.findElement(checkPasswordEmpty).getText();
        Assert.assertEquals(str,text);
    }
    //mail giri??i
    public void enterEmail(String text){
        driver.findElement(checkTextEmail).sendKeys(text);
    }
    //??ifre bo?? mesaj?? kontrolu
    public void checkNotEmailEmptyMassage(){
        driver.findElement(checkPasswordEmpty);
    }
    //??ifre giri??i
    public void enterPassword(String text){
        driver.findElement(checkTextPassword).sendKeys(text);
    }
    public void checkNotPasswordEmptyMassage(){
        driver.findElement(checkMailEmpty);
    }
    //mail girip giri?? tu??una bas??lmas??
    public void enterEmailClick(String text){
        driver.findElement(checkTextEmail).sendKeys(text);
        driver.findElement(checkLoginPage).click();
    }
    //mail yanl???? mesaj?? kontrolu
    public void emailFalseMassage(String text){
        String str=driver.findElement(checkMailEmpty).getText();
        Assert.assertEquals(str,text);
    } //mail ??ifre girilip login butonuna t??klanmas??
    public void enterEmailAndPasswordClick(String mail,String password){
        driver.findElement(checkTextEmail).sendKeys(mail);
        driver.findElement(checkTextPassword).sendKeys(password);
        driver.findElement(clickLoginbtn).click();
    }
    public void checkLoginErorMassage(String text){
        String str=driver.findElement(checkFalseLogin).getText();
        Assert.assertEquals(str,text);

    }





}

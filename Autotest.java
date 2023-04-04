package ru.rambler.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Registration {

    private static WebDriver webDriver;

    @BeforeClass
    public static void init() throws Exception {
        System.setProperty("webdriver.chrome.driver","path\\chromedriver_2.31\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quit() throws Exception {
        webDriver.quit();
    }

    // login & password корректный
    @Test
    public void testMailBoxAlreadyExists() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("login.username")).sendKeys("GB202303616b94");
        webDriver.findElement(By.id("password.main")).sendKeys("d0cf321a2e");

        Assert.assertEquals("Пользователь существует",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input")).getText());
}

    //login & password некорректный
    @Test
    public void testMailBoxAlreadyExists() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("login.username")).sendKeys("sfsfsdfsfsf");
        webDriver.findElement(By.id("password.main")).sendKeys("3h3h3h3h3h3h3");

        Assert.assertEquals("Пользователь не существует",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }


    //размер login меньше допустимого(<3)
    @Test
    public void testMailboxLessMin() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("login.username")).sendKeys("x");

        Assert.assertEquals("логин меньше допустимого",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }

    //размер login больше допустимого(>31)
    @Test
    public void testMailboxLargerMax() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("login.username")).sendKeys("fdgdfgdfgdfgdfggdddddddddddddd");
        webDriver.findElement(By.cssSelector("#root > div > div > form > footer > button")).click();

        Assert.assertEquals("логин больше допустимого",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }

    //пароль значение меньше 3 символов
    @Test
    public void testPasswordLessMin() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("password.main")).sendKeys("fdg");
        Assert.assertEquals("Пароль должен содержать больше 3 символов",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }

    //пароль значение больше 32 символов
    @Test
    public void testPasswordLargerMax() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("password.main")).sendKeys("asdfghjklqasdfghjklqasdfghjklqddf");
        Assert.assertEquals("Пароль должен содержать меньше 32 символов",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }

    //пароль должен содержать от 3 до 32 латинских букв и цифр, а также символы ! @ $ % ^ & * ( ) _ - +
    @Test
    public void testPasswordNonLatinLetters() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("password.main")).sendKeys("вапвавпа");
        Assert.assertEquals("Вы вводите русские буквы",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }


    //проверка пароля, при вводе только цифр
    @Test
    public void testPasswordOnlyNumbers() throws Exception {
        webDriver.get("https://test-stand.gb.ru/login");
        webDriver.findElement(By.id("password.main")).sendKeys("42342342342343423424");

        Assert.assertEquals("Пароль средней сложности",
                webDriver.findElement(By.xpath("//*[mdc-text-field__input]")).getText());
    }


}

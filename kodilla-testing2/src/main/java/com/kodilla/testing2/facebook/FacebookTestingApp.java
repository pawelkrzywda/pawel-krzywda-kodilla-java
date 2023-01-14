package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String DOMAIN = "https://www.facebook.com/";
    public static final String XPATH_COOKIES = "//div[@class=\"_4-i2 _pig _9o-c _9pll _50f4\"]/div[3]/button[1]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    private static final String XPATH_FORM = "//form[@method=\"post\" and @id=\"reg\"]";
    private static final String XPATH_NAME = XPATH_FORM + "/div[1]/div[1]/div[1]/div[1]/div/input";
    private static final String XPATH_SURNAME = XPATH_FORM + "/div[1]/div[1]/div[1]/div[2]/div/div[1]/input";
    private static final String XPATH_MAIL = XPATH_FORM + "/div[1]/div[2]/div/div[1]/input";
    private static final String XPATH_MAIL_REPEAT = XPATH_FORM + "/div[1]/div[3]/div/div/div[1]/input";
    private static final String XPATH_PASS = XPATH_FORM + "/div[1]/div[4]/div/div[1]/input";
    public static final String XPATH_DAY = "//select[contains(@name, 'birthday_day')]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";
    private static final String XPATH_SEX_MAN = XPATH_FORM + "/div[1]/div[7]/span/span[2]/input";

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(DOMAIN);

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(XPATH_NAME)).sendKeys("Pawel");
        driver.findElement(By.xpath(XPATH_SURNAME)).sendKeys("Krzywda");
        driver.findElement(By.xpath(XPATH_MAIL)).sendKeys("mail@testmail.com");
        driver.findElement(By.xpath(XPATH_PASS)).sendKeys("password");
        Thread.sleep(1000);

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select daySelect = new Select(day);
        daySelect.selectByIndex(30);
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(month);
        monthSelect.selectByIndex(11);
        Thread.sleep(1000);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1980");
        Thread.sleep(1000);

        driver.findElement(By.xpath(XPATH_SEX_MAN)).click();
        driver.findElement(By.xpath(XPATH_MAIL_REPEAT)).sendKeys("mail@testmail.com");
        Thread.sleep(2000);
    }
}
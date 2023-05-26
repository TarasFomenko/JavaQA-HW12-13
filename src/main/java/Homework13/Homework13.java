package Homework13;

import Configuration.WEBDRIVERS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Configuration.BaseClass.driver;

public class Homework13 {
    public static final String urlHillel = "https://ithillel.ua/";
    public static final String hillelTitle ="Комп'ютерна школа Hillel Online: Курси IT-технологій";

    public static void main(String[] args) throws InterruptedException {
        driver.get(urlHillel);
        if(!driver.getTitle().equals(hillelTitle)){
            System.out.println("Wrong page");
            driver.quit();
        }

        WebElement listOfCourses = driver.findElement(By.xpath("//button[@data-dropdown-trigger='coursesMenu']"));
        listOfCourses.click();
        WebElement programming = driver.findElement(By.xpath("//button[@data-category ='programming']"));
        programming.click();
        Thread.sleep(1000);
        WebElement frontEndBasic = driver.findElement(By.xpath("//*[@id=\"block-202987\"]//a[@href='https://ithillel.ua/courses/front-end-basic']"));
        frontEndBasic.click();
        Thread.sleep(5000);

        ScrollToElement.scrollToElementVisibilityOf(driver,new By.ByXPath("//*[@id=\"coachesSection\"]/div/div/div/h2"));
    }
}

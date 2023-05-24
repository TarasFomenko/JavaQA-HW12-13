package Homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Configuration.BaseClass.driver;

public class Homework12 {

    public static final String urlHillel = "https://ithillel.ua/";
    public static final String hillelTitle ="Комп'ютерна школа Hillel у Києві: Курси IT-технологій";
    public static void main(String[] args) throws InterruptedException {
        driver.get(urlHillel);
        if(!driver.getTitle().equals(hillelTitle)){
            System.out.println("Wrong page");
            driver.quit();
        }
        WebElement freeConsultation = driver.findElement(By.id("btn-consultation-hero"));
        freeConsultation.click();
        WebElement nameInput = driver.findElement(By.id("input-name-consultation"));
        nameInput.sendKeys("Taras Fomenko");
        WebElement emailInput = driver.findElement(By.id("input-email-consultation"));
        emailInput.sendKeys("taras.fomenko@gmail.com");
        WebElement phoneInput = driver.findElement(By.id("input-tel-consultation"));
        phoneInput.sendKeys("631234567");
        WebElement messengerSelection = driver.findElement(By.xpath("//button[contains(@data-name,\"tg\")]"));
        messengerSelection.sendKeys("@Taras");
        WebElement courseList = driver.findElement(By.id("listbox-btn-input-course-consultation"));
        courseList.click();
        WebElement searchInput = driver.findElement(By.className("listbox_search-input"));
        searchInput.sendKeys("QA");
        WebElement aqaJava = driver.findElement(By.xpath("//li[contains(@data-entry-id,'129290')]"));
        aqaJava.click();
        WebElement checkBox = driver.findElement(By.className("checkbox_checkmark"));
        checkBox.click();
        Thread.sleep(5000);
        driver.quit();
    }
}

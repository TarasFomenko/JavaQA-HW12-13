package Homework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

import static Configuration.BaseClass.driver;

public class Homework13 {
    public static final String urlHillel = "https://ithillel.ua/";
    public static final String hillelTitle = "Комп'ютерна школа Hillel Online: Курси IT-технологій";

    public static void main(String[] args) throws InterruptedException {
        driver.get(urlHillel);
        if (!driver.getTitle().equals(hillelTitle)) {
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
        Thread.sleep(2000);
        //Добрались до начала списка учителей
        ScrollToElement.scrollToElementVisibilityOf(driver, new By.ByXPath("//ul[@class ='coach-list coaches_list']"));

        //Нашли все элементы, которые нам нужны (Учителя)
        List<WebElement> listOfAllTeachers = driver.findElements(By.xpath("//ul[@class ='coach-list coaches_list']/li/a/div/div/div/img"));
        List<String> teachersNames = new ArrayList<>();

        //Вытягиваем нужный нам атрибут из списка и ложим в List
        for (WebElement element : listOfAllTeachers) {
            String attributeValue = element.getAttribute("alt");
            teachersNames.add(attributeValue);
        }

        //Выводим список в консоль
        for (String value : teachersNames) {
            System.out.println(value);
        }

    }}
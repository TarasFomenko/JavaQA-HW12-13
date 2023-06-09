package Homework13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class ScrollToElement {
    public static void scrollToElementVisibilityOf(WebDriver driver, By by) {//метод который скролит до элемента
        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean bool = false;

        while (!bool) {//цикл проверяет есть ли элемент, если не находит скролит до тех пор пока не найдет этот элемент
            try {
                driver.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,1000)");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String args[])
    {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.id("input-1")).sendKeys("2100031928@kluniversity.in");
        driver.findElement(By.id("input-2")).sendKeys("kiran@21l6");
        driver.findElement(By.id("input-2")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("ui-btn ui-btn-large ui-btn-primary auth-button ui-btn-styled")).submit();
    }
}

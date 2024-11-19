package com.saucedemo.tests.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
// creo lo necesario para inicializar los test , cerrar los test y no repetir codigo

protected WebDriver driver;
protected BasePage basePage;
protected LogInPage loginPage;
private String url ="https://www.saucedemo.com";

@BeforeClass

    public void setUp()
{
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);
basePage=new BasePage();
basePage.setDriver(driver);
loginPage=new LogInPage();
}

//@AfterClass

  //  public void tearDown()
//{
//    driver.quit();
//}




























}

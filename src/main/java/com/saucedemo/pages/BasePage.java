package com.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public  class BasePage
{

    // SuperClase en la cual voy a centralizar los metodos comunes de Selenium para mayor legibilidad de otros testes


  //  creo la variable tipo WebDriver , estatica .
public static WebDriver driver;

//instancio el webdriver

public void setDriver(WebDriver driver)
{
    BasePage.driver = driver;
}

//encontrar objetos al mandarle los localizadores , me devuelve un objeto WebElement
protected WebElement find (By locator)
{
    return driver.findElement(locator);
}

// Usando el metodo find creo el metodo para poner un texto en un campo de entrada (limpiando antes)
    protected void set(By locator, String text)
{
find(locator).clear();
find(locator).sendKeys(text);
}

// el metodo para hacer click en algo que busco
protected void click(By locator)
{
 find(locator).click();
}










}

package com.saucedemo.pages;

import org.openqa.selenium.By;


public class ProductsPage extends BasePage
{
    //localizador

    private By productsHeader = By.xpath("//span[text()='Products']");


    //la accion que quiero que isDisplayed es boolean
    //y lo uso para una respuesta en los test

public boolean isProductsHeaderDisplayed()
{
    return find(productsHeader).isDisplayed();
}































}

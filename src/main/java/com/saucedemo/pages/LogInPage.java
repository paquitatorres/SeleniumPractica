package com.saucedemo.pages;
import org.openqa.selenium.By;

import com.saucedemo.pages.BasePage;

public class LogInPage extends BasePage
{

    // elemenentos y acciones de la pagina en este caso LogIn


private By userNameField = By.id("user-name");
private By passwordField =By.id("password");
private By loginButton = By.id("login-button");
private By errorMessage= By.cssSelector("#login_button_container h3");



public void setUserName(String username)
{
    set(userNameField, username);
}

public void setPasswordField(String password)
{
    set(passwordField, password);

}

//tengo un metodo de transicion de una pagina a otra
// el método me devuelve una nueva instancia de ProductsPage, por si despues le indico para que navegue a la página de productos

public ProductsPage clickLogInButton()
{
    click(loginButton);
    return new ProductsPage();
}


// un metodo para el logIn entero
public ProductsPage logIntoAplication(String username, String password)
{
    setUserName(username);
    setPasswordField(password);
    return clickLogInButton();

    //return porque quiero que me deje incializado el productPage ,


}

//Un metodo que me devuelva el texto del error para que me sea util en el test cuando ponga mal el usuario/contraseña
    public String getErrorMessage()
    {
        return find(errorMessage).getText();
    }















}

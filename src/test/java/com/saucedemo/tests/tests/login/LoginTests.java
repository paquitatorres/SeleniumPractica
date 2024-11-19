package com.saucedemo.tests.tests.login;
import com.saucedemo.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest
// Aqui van los Tests que quiero realizar

{

@Test


// Ver si da el mensaje de error si pongo mal la contraseña

    public void testLoginErrorMessage()
{
   loginPage.setUserName("standard_user");
   loginPage.setPasswordField("malpassword");
    loginPage.clickLogInButton();
    String actualMessage = loginPage.getErrorMessage();

    Assert.assertTrue(actualMessage.contains("Epic sadface"));

}

























}

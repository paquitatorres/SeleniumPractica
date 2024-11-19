package com.saucedemo.tests.tests.products;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest
{

  @Test

  public void testProductHeaderIsDispayed()
  {
      ProductsPage productsPage = loginPage.logIntoAplication("standard_user","secret_sauce");

      // el encapsular la lógica del inicio de sesión dentro del método logIntoAplication
      //logIntoAplication me devuelve o retornar un objeto que este caso seria la pagina despues del logIn

      Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header is not Displayed \n");
    // isProductsHeaderDisplayed() me devuelve un booleano
      // y en caso que no estuviera el Header  me daria false y el mensaje que no esta
      // este test no tiene que ver con el contenido del Header sino si esta o no.

  }



























}

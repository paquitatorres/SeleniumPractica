
# Muestra de POM en Selenium para mis amigos 

Es una practica donde se muestra unos test siguiendo el formato Page Object Model, que es un patrón de diseño que permite reusar código reduciendo la cantidad de código duplicado y por su buena organización un mantenimiento del código de las pruebas ante una modificación. 
 
 
## Como entenderlo :

Para no enloquecer en la lectura y entender el formato POM recomiendo tener este README abierto para que explorarlo y entenderlo sea más fácil.  

Lo importante del código esta en la carpeta **src** , ahí vas a encontrar dos carpetas 

- **main/java/com/saucedemo/pages** que es donde se pone todo lo referente a las paginas que se prueban. 

- **test/java/com/saucedemo/tests** que es donde se pone todo lo referente a los test que se quieren correr.

(Existe una separación clara entre el código de prueba y el código específico de la página)
  

Son pruebas simples porque aquí lo importante es la estructura, no los test en sí: 

1) Entrar a la pagina https://www.saucedemo.com/ poner mal la contraseña , que se muestre el mensaje de error , y *comprobar que está ese mensaje de error*. 

2) Un logIn exitoso seguido de *comprobar que está la cabecera en el Home* . 

Esto esta esquematizado de la  siguiente manera:  

## Esquema: 

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## 

En la carpeta **main/java/com/saucedemo/pages**

- **App.java** esta hay que ignorarla porque quedo (pero no tenia que subirlo).

- **BasePage.java** aquí unifico todos los métodos de selenium comunes en las pruebas en este caso: inicializar el driver, buscar a un localizador, escribir un texto en un localizador, y hacer click en un localizador. 

- **LogInPage.java** aquí pongo los localizadores de la pagina del LogInPage que necesito y las acciones que necesito para despues realizar los test, ojo que los Assert los pongo en los test esos no los pongo aquí. 

- **ProductsPage.java** aquí van los localizadores de la pagina Home, es la pagina que sigue después que se hace un LogIn exitoso, y la acción que quiero que es que me mande true si esta desplegado el Header

En la carpeta **test/java/com/saucedemo/tests**

Carpeta **Base**

- **BaseTest.java** aquí va todo lo que quiero que se ejecute antes de los test y despues de los test 

Carpeta **tests**

- **LoginTests.java** el test en cuestión de la pagina LogIn , si hubiera mas tests de esa pagina podrían ir aquí.

-**ProductsTest.java** el test de la pagina del Home. 


Espero que les sea útil , sino cualquier cosa me escriben . 

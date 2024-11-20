
# 🌈 Muestra de POM en Selenium para mis amigos 

 Esta practica se centra en aplicar el modelo de diseño Page Object Model (POM) para hacer tests. Este diseño ayuda a reutilizar código, evitando repetición  y por su segmentación permite una buena organización que hace más fácil actualizar/matener las pruebas en el tiempo.

 ## Tools y dependencias : 

- Lenguaje Java (Java- JDK 22 pero cualquiera esta bien). 
- Framework Intellij Idea
- Dependencias de Maven  :
  
     - Selenium 
     - WebDriverManager de Boni Garcia
     -  TestNG

Estan especificadas en **" pom.xml"** .  
 
## 💌 Como entenderlo :

Para no enloquecer en la lectura y entender el formato POM recomiendo tener este README abierto, para que explorarlo y entenderlo sea más fácil.  

Lo importante del código esta en la carpeta **"src"** , ahí vas a encontrar dos carpetas: 

- **main/java/com/saucedemo/pages** que es donde se pone todo **lo referente a las paginas** que se prueban. 

- **test/java/com/saucedemo/tests** que es donde se pone todo **lo referente a los test** que se quieren correr.

(La principal caracteristica de este formato es que existe una separación clara entre el código específico perteneciente a las páginas y el código de las pruebas). 

  :shipit: *Break ardillita para respirar profundo y meternos en lo más importante que es la estructura o esquematizacion:*

Son pruebas simples porque aquí lo importante es la estructura, no los test en sí: 

1) Entrar a la pagina https://www.saucedemo.com/ poner mal la contraseña , que se muestre el mensaje de error , y *comprobar que está ese mensaje de error*. 

2) Un logIn exitoso seguido de *comprobar que está la cabecera en el Home(ProductsPage)* . 


El Test 1 se realiza completamente dentro de la página que llamaremos LogIn.
El Test 2, en cambio, comienza en la página LogIn y realiza una transición hacia otra página que llamaremos ProductsPage.


Está esquematizado de la  siguiente manera:  

## Esquema de flujo: 

![Main Idea](https://github.com/user-attachments/assets/37ee8aae-616e-45a2-8256-294586888fbc)


## 

En la carpeta **main/java/com/saucedemo/pages**

- **App.java** esta hay que ignorarla porque quedo (pero no tenia que subirlo).

   **BasePage.java**  aquí unifico todos los métodos de selenium comunes en las pruebas en este caso: inicializar el driver, buscar a un localizador, escribir un texto en un localizador, y hacer click en un localizador. 

- **LogInPage.java** aquí pongo los localizadores de la pagina del LogInPage que necesito y las acciones que necesito para despues realizar los test, ojo que los Assert los pongo en los test esos no los pongo aquí. 

- **ProductsPage.java** aquí van los localizadores de la pagina Home, es la pagina que sigue después que se hace un LogIn exitoso, y la acción que quiero que es que me mande true si esta desplegado el Header

En la carpeta **test/java/com/saucedemo/tests**

Carpeta **Base**

- **BaseTest.java** aquí va todo lo que quiero que se ejecute antes de los test como abrir el navegador y maximizar y despues de los test que es cerrar la pagina o el navegador.

Carpeta **tests**

- **LoginTests.java** el test en cuestión de la pagina LogIn , si hubiera mas tests de esa pagina podrían ir aquí.

- **ProductsTest.java** el test de la pagina del Home. 


Espero que les sea útil , sino cualquier cosa me escriben al LinkedIn . 

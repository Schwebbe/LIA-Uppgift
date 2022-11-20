
# LIA Uppgift för easit

Detta Spring Boot projekt är en miniräknare som tar in två inparametrar och returnerar resultatet av
den valda operationen på de två inparametrarna.

Projektet har stöd för följande operationer: 
**add, subtract, divide, multiply, div, mod, max, min**\
Dessutom för avrundningstyper: **ceiling, floor, round**

## Programkrav
* Postman
* Valfritt IDE som kan köra Spring Boot projektet - i detta demo använder vi IntelliJ.



## Instruktioner för operationer (För: **add, subtract, divide, multiply, div, mod, max, min** )
 1. Öppna projektet i ditt IDE
 2. Starta programmet 
 (Bild bifogad från IntelliJ).  <br>
 ![App Screenshot](https://i.gyazo.com/b5d2a8e9614fd974b8fa495deff612eb.png)\
 Projektet körs på localhost med port 9090.
 
 3. Öppna Postman
 4. I postman, öppna en ny flik och skriv in länken `http://localhost:9090/ + operator` och välj **POST** funktionen. \
I detta exempel använder vi **add**:  `http://localhost:9090/add`\
![App Screenshot](https://i.gyazo.com/0f98a30b32cdd26dc24c2b367ead816f.png)

5. Under länken så tryck på **Body** tabellen, välj **raw** text och sedan JSON format.
![App Screenshot](https://i.gyazo.com/3badec6d9f432ff2c9816c67dd5569be.gif)



I textfältet nedan så skriver du följande som står på bilden nedan och tryck på **Send**.
![App Screenshot](https://i.gyazo.com/bf1fc51e50444ebba3c213e57bfe1e76.png)

Nedanför så får du resultatet av operationen du har valt.
![App Screenshot](https://i.gyazo.com/9c9da6cc698df7eb4e60a8c2faaedfbf.png)

## Instruktioner för avrundningstyper (För: **ceiling, floor, round**)
1. Öppna projektet & Postman och lägg upp allt på samma sätt som tidigare.
2. Istället för två tal så krävs bara ett tal, i detta demo så använder vi **numOne**.

I bifogad bild så har vi avrundningstypen **ceiling**, vill du prova de andra avrundningstyperna så behöver du bara byta ut **ceiling** mot en av de andra typerna (**floor** eller **round**).
![App Screenshot](https://i.gyazo.com/84f3944f169f33ec9a2fbc214a7d6465.png)

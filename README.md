
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
 4. I postman, öppna en ny flik och skriv in länken `http://localhost:9090/ + operator` och välj GET funktionen. \
I detta exempel använder vi **add**:  `http://localhost:9090/add`\
![App Screenshot](https://i.gyazo.com/d1e7cb81296532079480704f1fb4a190.png)

5. Under länken så tryck på **Body** tabellen, välj **raw** text och sedan JSON format.
![App Screenshot](https://i.gyazo.com/cd1121b8116e942932050edf3f812a0b.gif)



I textfältet nedan så skriver du följande som står på bilden nedan och tryck på **Send**.
![App Screenshot](https://i.gyazo.com/9729f6c2fed710b038bc6dd03ea88dd1.png)

Nedanför så får du resultatet av operationen du har valt.
![App Screenshot](https://i.gyazo.com/b49bf80b5529880d9187d69dd71db5a3.png)

## Instruktioner för avrundningstyper (För: **ceiling, floor, round**)
1. Öppna projektet & Postman och lägg upp allt på samma sätt som tidigare.
2. Istället för två tal så krävs bara ett tal, i detta demo så använder vi **numOne**.

I bifogad bild så har vi avrundningstypen **ceiling**, vill du prova de andra avrundningstyperna så behöver du bara byta ut **ceiling** mot en av de andra typerna (**floor** eller **round**).
![App Screenshot](https://i.gyazo.com/7e4f3b383fa62f86acc366b9b725b787.png)

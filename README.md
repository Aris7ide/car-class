# CAR CLASS

## 📌 Has de crear una classe que representi un cotxe amb algunes particularitats que et permetran entendre com funciona la memòria i la inicialització en Java.

## ✨ Metodos estaticos y no estaticos, atributos final y no.

## 🛠 JAVA

## Respuestas punto 2
    - ¿Cuál de estos atributos puede inicializarse desde el constructor?
        Solo power, es el unico valor que necesariamente se tiene que llamar 
        a la construccion del objeto. Siendo final solo se puede llamar una
        vez por objeto.
    - ¿Cuál no puede modificarse nunca?
        BRAND, siendo final y static, una vez definido en la clase serà igual
        para todos los objetos, y siendo final no se puede cambiar.
    - ¿Cuál afecta a todas las instancias de la clase?
        Todos los que son estaticos, si se cambia en un objeto se cambiarà en
        todos los objetos. 

## Valoraciones
    Añadiendo un setModel() al main, cada vez que cambiamos el model del coche 
    este mismo cambia para todos los coches, demonstrando el static del atributo
    model.

# Animaciones-C12

Proyecto Grupo de Trabajo Interface Grafica 
Diana Valentina Uscategui Tobo - 20172020063

Se implemento la animación de las tarjetas del panel principal, entendiendo y comprendiendo todos los enfoques para realizar la animación pero en distintas formas.

# Animaciones para muestra de información.

Las animaciones además de darle interactividad a nuestras interfaces gráficas también pueden ser nuestras aliadas para mostrar información adicional que posiblemente no podamos ubicar dentro de las dimensiones de nuestra interfaz.

# Preparativos para la animación

## Nuevos elementos en la clase InicioTemplate

En la clase incio template agregamos 4 nuevas tarjetas, declaramos 5 nuevos paneles ya que el enfoque utilizado para las tarjetas era de incorporación, de igual forma declaramos 2 botones y 3 imagenes más, todos los elementos agregados se pueden observar en la siguiente imagen: 

![iniciotemplate](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/inicioelementos.png)

## Creación de los nuevos paneles en la clase InicioTemplate

Se creo el panel Tarjetas que sera usado para la animación, junto con la creacion de los 4 paneles más, todos los paneles seran agregados al pTarjetas:

![panelescreacion](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/creacionpaneles.png)

El panel tarjetas es mas largo que nuestro panel inicio ya que las 4 nuevas tarjetas aunque no se vean inicialmente se agregaran a este panel de manera vertical y uniforme.

## Creación Botones en la clase InicioTemplate 

![botonescreacion](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/creacionbotones.png)

Podemos notar que estos Botones se están agregando directamente al componente y no a otro panel creado en el, también notamos que se esta agregando de una vez la escucha a eventos ActionListener 

## Creación Tarjetas en la clase InicioTemplate

Se van a crear las otras 4 tarjetas de la misma manera que hicimos con las 4 anteriores, así que se va a crear un método por cada una:

![creaciontarjetas](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/TARJETAS.PNG)

## Creación métodos get en la clase InicioTemplate

Por ultimo vamos a crear los métodos get a los dos botones y al panel que contiene las tarjetas:

![creacionmetodosget](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/metodosget.PNG)

## Implementación de eventos ActionListener en la clase Inicio component 

No solo se implementa el evento actionListener, también creamos el objeto Timer encargado de gestionar la animación y por ultimo vamos a declarar  dos atributos enteros que nos ayudaran con el propósito de la animación:

![action](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/claseincio.png)

## Método ActionPerformed en la Clase Inicio Component

Ahora dentro del método implementado ActionPerformed vamos a realizar una discriminación de objetos con nuestros botones:

![action](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/accionperformed.png)

* Cuando oprimamos el boton bArriba queremos ver las tarjetas que están arriba esto quiere decir que debemos correr el panel para abajo (1).
* Cuando oprimamos el boton bAbajo queremos ver las tarjetas que están más a la abajo esto quiere decir que debemos correr el panel para arriba (-1).

# Enfoques de animación.

## Enfoque 1: Muestra las 4 tarjetas primeras y luego las 4 nuevas.

Se creara el método moverTarjeta1 con los puntos de freno y la indicación de como debe moverse el panel.

![metodo1](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/mover1.png)

![animacion1](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/metodo1int.PNG)

## Enfoque 2: Recorrera las tarjetas en tramos cortos 

Se creara el metodo moverTarjeta2 con los puntos de freno y la indicación de como debe moverse el panel.

![metodo2](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/mover2.png)

![animacion2](https://github.com/valentinatobo/Animaciones-C12/blob/master/Proy_Twitter/imagenes/metodo2int.PNG)
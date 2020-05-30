# Laberinto

El programa permite al usuario resolver el laberinto propuesto. Si necesita ayuda, el programa permite ver la solución.

## Tabla de Contenido

1. [Instalación](https://github.com/SantiagoArboleda1/Laberinto/tree/master#1-instalaci%C3%B3n)
2. [Instrucciones de uso](https://github.com/SantiagoArboleda1/Laberinto/tree/master#2-instrucciones-de-uso)
3. [Funcionamiento](https://github.com/SantiagoArboleda1/Laberinto/tree/master#3-funcionamiento)

## 1. Instalación
Hay 2 opciones:

- Descargar la ultima versión  del JAR [aqui](https://github.com/SantiagoArboleda1/Laberinto/releases).
- Descargar el código fuente y abrirlo en NetBeans.

## 2. Instrucciones de uso

El objetivo del juego es llegar al final del laberinto. El jugador puede únicamente por los caminos (de color cyan). Las casillas de color gris representan los muros. La casilla central, color magenta, representa al jugador. Si decide activar la solución, algunos caminos se mostraran de color verde, indicando el camino correcto. Si no ve ningún camino verde, considere retroceder hasta encontrarlos.

![Interfaz](GUI.png)

- Botón **"Arriba"**: Registra un movimiento hacia arriba.
- Botón **"Abajo"**: Registra un movimiento hacia abajo.
- Botón **"Izquierda"**: Registra un movimiento hacia la izquierda.
- Botón **"Derecha"**: Registra un movimiento hacia la derecha.
- Botón **"Mostrar ayuda"**: Muestra la solución del laberinto.
- Botón **"Ocultar ayuda"**: Oculta la solución del laberinto.

## 3. Funcionamiento

El programa hace uso de 9 JPanels (nombrados de la A a la H, y el panel del jugador) para representar graficamente el movimiento en la matriz "Laberinto", que contiene "el mapa".

Los botones registran el movimiento en la matriz. Es imposible que se presente el error de que alguno de los mapas intente mostrar posiciones que no esten en la matriz, porque antes de cada movimiento se comprueba si se esta moviendo a una posicion permitida ("Camino") y los "bordes del mapa" son posiciones prohibidas ("Muro").

La sensacion de movimiento se genera al cambiar el color de fondo de los paneles, excepto el panel que representa el jugador. Este cambio depende del valor de la posicion en la matriz "Laberinto".

Los botones de movimiento funcionan de la siguiente manera:

1. Primero comprueba que el movimiento se haga hacia una posicion permitida.

```java       
if (laberinto[M][N] == 0) {
  JOptionPane.showMessageDialog(this, "Movimiento no permitido");
  }
```

2. Luego realiza el movimiento. Este paso depende de la direccion del desplazamiento. Ej:

```java
// Para ir hacia arriba se resta 1 en el valor de filas de la coordenada en la matriz laberinto
aM = aM - 1;
bM = bM - 1;
cM = cM - 1;
dM = dM - 1;
eM = eM - 1;
fM = fM - 1;
gM = gM - 1;
hM = hM - 1;
playerM = playerM - 1;
```

3. Se envian las coordenadas nuevas al metodo pintarMapa, que asigna el color correcto a cada panel. El color tambien varia si la solucion esta oculta o visible.

```java
    public void pintarMapa(JPanel mapa, int m, int n) {
        int terreno = laberinto[m][n];
        switch (terreno) {
            case 0:
                mapa.setBackground(Color.gray);
                break;
            case 1:
                mapa.setBackground(Color.cyan);
                break;
            case 2:
                if (solucion == 0) {
                    mapa.setBackground(Color.cyan);
                } else if (solucion == 1) {
                    mapa.setBackground(Color.green);
                }
                break;
            case 3:
                mapa.setBackground(Color.cyan);
                break;
            case 4:
                mapa.setBackground(Color.red);
            default:
                break;
        }
    }
```
El boton de solucion comprueba si la solucion esta desactivada o activada. Luego la activa o desactiva dependiendo del estado. Al final envia las coordenadas actuales al metodo pintarMapa para ocultar o mostrar la solucion.

```java
if (solucion == 0) {
  // Si la solucion esta desactivada, se activa
  solucion = 1;
  botonSolucion.setText("Ocultar ayuda");
  pintarMapa ...
  
} else if (solucion == 1) {
  // Si la solucion esta activada, se desactiva
  solucion = 0;
  botonSolucion.setText("Mostrar ayuda");
  pintarMapa ...
}
```

El codigo fuente explica con mas detalle lo anterior.

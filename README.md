# Método de Gauss-Jordan con Reutilización Modular en Java

Proyecto desarrollado en Java que implementa la resolución de sistemas de ecuaciones lineales mediante el método de **Gauss-Jordan**, reutilizando de forma modular el método de triangulación superior.

## 1. Estructura Modular del Proyecto
- **`Main.java`**: Clase principal que mantiene el método `main` limpio y unificado para la ejecución.
- **`Gauss.java`**: Contiene la lógica modular para obtener la matriz triangular superior mediante eliminación gaussiana.
- **`GaussJordan.java`**: Realiza la normalización de pivotes y el barrido superior para llegar a la matriz identidad.

## 2. Pasos para Compilar y Ejecutar
1. Abre tu proyecto en IntelliJ IDEA.
2. Asegúrate de tener las tres clases (`Main`, `Gauss`, `GaussJordan`) dentro de la carpeta `src`.
3. Da clic en el botón de **Run** en la clase `Main`.

## 3. Ejemplo de Prueba y Salida por Consola
```text
Matriz original:
    2.0000     1.0000    -1.0000     8.0000 
   -3.0000    -1.0000     2.0000   -11.0000 
   -2.0000     1.0000     2.0000    -3.0000 

Matriz final (Gauss-Jordan):
    1.0000     0.0000     0.0000     2.0000 
    0.0000     1.0000     0.0000     3.0000 
    0.0000     0.0000     1.0000    -1.0000 

Resultados:
x1 = 2.0
x2 = 3.0
x3 = -1.0
# 🌳 Práctica de Estructuras de Datos: Árboles Binarios

## 📌 Información General

- **Título:** Práctica de Algoritmos con Árboles Binarios  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Jaime Loja  
- **Fecha:** 06/07/2025  
- **Profesor:** Ing. Pablo Torres  

---

## 🛠️ Descripción

Este programa implementa y ejecuta 4 algoritmos clásicos sobre árboles binarios de búsqueda (BST):

1. **Insertar valores en un Árbol Binario de Búsqueda (BST).**
2. **Invertir un Árbol Binario.**
3. **Listar nodos por nivel (nivel por línea).**
4. **Calcular la profundidad máxima del árbol.**

Los algoritmos usan estructuras y recorridos comunes como:
- Recorrido por niveles (BFS).
- Recursión.
- Impresión estructurada de árbol en consola.

---

## 📦 Estructura del Código

### `App.java`
Contiene el `main()` que ejecuta todos los ejercicios con los mismos valores de entrada (`5, 3, 7, 2, 4, 6, 8`). Se muestran los resultados de cada ejercicio automáticamente.

### `ArbolBinario.java`
Clase para construir e imprimir un árbol binario de búsqueda (BST).

### `InvertBinaryTree.java`
Contiene el algoritmo para invertir recursivamente el árbol binario.

### `ListLevels.java`
Devuelve una lista de listas de nodos, agrupados por niveles usando recorrido por niveles (BFS).

### `Depth.java`
Calcula la profundidad máxima del árbol usando recursión.

---

## ▶️ Ejecución Automática

El programa se ejecuta directamente sin interacción del usuario y presenta los resultados en consola.

---

## 📋 Ejemplo de Salida
```java
---------------Programa funcionando---------------
? Estudiante: Jaime Loja
??  Correo: jlojat2@est.ups.edu.ec

Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

 ├── 5
 │   ├── 3
 │   │   ├── 2
 │   │   └── 4
 │   └── 7
 │       ├── 6
 │       └── 8
------------------------------------------------------------------------------

Ejercicio 02: Invertir un Árbol Binario

Arbol normal
 ├── 5
 │   ├── 3
 │   │   ├── 2
 │   │   └── 4
 │   └── 7
 │       ├── 6
 │       └── 8
Arbol invertido
├── 5
│   ├── 7
│   │   ├── 8
│   │   └── 6
│   └── 3
│       ├── 4
│       └── 2
------------------------------------------------------------------------------

Ejercicio 03: Listar Niveles en Listas Enlazadas

Arbol normal
 ├── 5
 │   ├── 7
 │   │   ├── 8
 │   │   └── 6
 │   └── 3
 │       ├── 4
 │       └── 2
5
7 -> 3
8 -> 6 -> 4 -> 2
------------------------------------------------------------------------------

Ejercicio 04: Calcular la Profundidad Máxima

Profundidad es de: 3
```

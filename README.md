# POO - Programación Orientada a Objetos

Repositorio de ejercicios prácticos de la materia **Programación Orientada a Objetos**. Desarrollado en **Java SE 8** utilizando **Apache NetBeans** como entorno de desarrollo.

## Contenido

El proyecto está organizado en tres unidades de evaluación, cada una cubriendo temas progresivos de POO:

### EVA1 — Fundamentos de Java y POO
Introducción a la sintaxis de Java, creación de clases, modificadores de acceso, el keyword `this`, miembros `static`, modelo de memoria (stack vs heap), y copia de objetos.

### EVA2 — Herencia, Interfaces, Polimorfismo y Clases Abstractas
Herencia entre clases, jerarquías de vehículos, interfaces y herencia de interfaces, clases abstractas, métodos abstractos, polimorfismo, arreglos, el keyword `final`, clases anónimas, y figuras geométricas con jerarquía polimórfica.

### EVA3 — Excepciones, Archivos y Serialización
Manejo de excepciones (try-catch-finally, throw, excepciones personalizadas), StackOverflow, NullPointerException, división entre cero, entrada/salida con archivos, buffers, escritura de archivos, serialización de objetos y arreglos serializables.

## Estructura del proyecto

```
POO/
├── src/                    # Código fuente
│   ├── EVA1_*             # Ejercicios de la unidad 1
│   ├── EVA2_*             # Ejercicios de la unidad 2
│   ├── EVA3_*             # Ejercicios de la unidad 3
│   └── Momentaneum.java   # Utilidad miscelánea
├── nbproject/              # Configuración del proyecto NetBeans
├── build.xml               # Script de compilación con Ant
├── manifest.mf             # Manifiesto del JAR
└── .gitignore
```

## Requisitos

- Java JDK 8 o superior
- Apache NetBeans IDE (recomendado) o cualquier IDE compatible con proyectos Ant

## Cómo ejecutar

1. Abrir el proyecto en NetBeans.
2. Seleccionar el paquete deseado dentro de `src/`.
3. Ejecutar la clase que contiene el método `main`.

O desde línea de comandos con Ant:

```bash
ant -Dmain.class=nombre.del.paquete.ClasePrincipal run
```

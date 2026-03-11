# conversor-monedas-java
Challene Conversor de monedas
# 💱 Conversor de Monedas en Java

Este proyecto es un **conversor de monedas desarrollado en Java** que utiliza la API pública de ExchangeRate para obtener tasas de cambio en tiempo real.

El programa funciona mediante un **menú interactivo en consola**, permitiendo al usuario seleccionar diferentes conversiones entre monedas.

---

## 🚀 Funcionalidades

El sistema permite realizar las siguientes conversiones:

1. Dólar ⇒ Peso argentino
2. Peso argentino ⇒ Dólar
3. Dólar ⇒ Real brasileño
4. Real brasileño ⇒ Dólar
5. Dólar ⇒ Peso colombiano
6. Peso colombiano ⇒ Dólar
7. Salir

El usuario ingresa el valor que desea convertir y el sistema muestra el resultado utilizando la tasa de cambio actual.

---

## 🛠 Tecnologías utilizadas

* **Java 21**
* **Maven**
* **Gson** (para parsear JSON)
* **ExchangeRate API** (para obtener tasas de cambio)
* **HTTP Client de Java**

---

## 📂 Estructura del proyecto

```
conversor-monedas-java
│
├── pom.xml
├── README.md
│
└── src
    └── main
        └── java
            ├── principal
            │   └── Main.java
            │
            ├── service
            │   └── ConnectServiceAPI.java
            │
            └── model
                └── JsonResponseAPI.java
```

### Descripción de las clases

**Main.java**

Contiene la lógica principal del programa:

* Muestra el menú
* Lee la opción del usuario
* Solicita el valor a convertir
* Muestra el resultado

---

**ConnectServiceAPI.java**

Clase encargada de:

* Conectarse a la API de ExchangeRate
* Realizar la solicitud HTTP
* Obtener la tasa de conversión entre monedas

---

**JsonResponseAPI.java**

Modelo que representa la respuesta JSON de la API.

Se utiliza junto con **Gson** para convertir la respuesta JSON en objetos Java.

---

## 🌐 API utilizada

El proyecto utiliza:

ExchangeRate API

Ejemplo de consulta:

```
https://v6.exchangerate-api.com/v6/TU_API_KEY/pair/USD/COP
```

Esta API devuelve la tasa de cambio entre las dos monedas solicitadas.

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio

```
git clone https://github.com/EdgarFandino/conversor-monedas-java.git
```

2. Abrir el proyecto en IntelliJ IDEA o cualquier IDE compatible con Maven.

3. Asegurarse de tener:

* Java 21
* Maven instalado

4. Ejecutar la clase:

```
Main.java
```

---

## 💻 Ejemplo de uso

```
***************************************************
Sea bienvenido/a al Conversor de Moneda :-)
***************************************************

1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Salir

Elija una opción válida:
```

Luego el usuario ingresa el valor y el sistema muestra el resultado convertido.

---

## 📦 Dependencias Maven

El proyecto utiliza la librería Gson para manejar JSON.

```xml
<dependency>
 <groupId>com.google.code.gson</groupId>
 <artifactId>gson</artifactId>
 <version>2.10.1</version>
</dependency>
```

---

## 👨‍💻 Autor

**Edgar Fandiño**

Proyecto realizado como parte del challenge de programación utilizando Java y consumo de APIs.

---

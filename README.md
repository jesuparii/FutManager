# Agenda Futbol
Una red social web, en la que los usuarios pueden poner anclar sus jugadores 
y subir a una nube anotaciones, videos, gestionar sesiones y chats con los jugadores

## Tecnologías
Al principio se va a crear con java pero al tener toda la estructura base hecha se migrará a springboot
* Lenguaje: Java 25
* Gestor de dependencias: Maven
* Interfaz: JavaFX 22 (`javafx-controls`, `javafx-fxml`)
* BD: PostgreSQL 18.4 (driver JDBC `postgresql` 42.7.14)
* Excel / documentos Office: Apache POI 6.0.0 (`poi`, `poi-ooxml`)
* IDE: IntelliJ IDEA

## Organización del proyecto
```
--- com.FutManager
------ com.FutManager.controller     # Endpoints API REST
------ com.FutManager.model          # Alberga las normas y atributos de cada clase
------ com.FutManager.repository     # Conexión con la base de datos
------ com.FutManager.service        # Crea la lógica del programa, concectando base de datos y siguiendo las normas de model
------ com.FutManager.ui             # Crea la interfaz del usuario
```
### Flujo de la información

```
ui ---> controler --> service --> repository ---> db
```

## Autor
Hecha por **Jesús Pariente González**, estudiante de segundo año de Ingeniería Informática en la Universidad Camilo José Cela (UCJC).

* GitHub: [P4RGON](https://github.com/jesuparii)

## Licencia
Este proyecto está distribuido bajo la licencia **GNU Affero General Public License v3.0 (AGPL-3.0)**.
Puedes usar, modificar y redistribuir el código, siempre que las versiones derivadas se publiquen también bajo AGPL-3.0 y con su código fuente disponible.
Esto también se aplica si el software se ofrece como servicio a través de una red (por ejemplo, como aplicación web): quien lo haga debe poner el código fuente a disposición de sus usuarios.

Consulta el archivo [LICENSE](LICENSE) para ver el texto completo.

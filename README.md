# Peluquería Canina

La Peluquería Canina requiere una aplicación para almacenar los datos de sus clientes peludos y sus dueños. La aplicación debe permitir el registro de información detallada de cada mascota y su respectivo dueño, y garantizar que los datos permanezcan en el tiempo para que los empleados de la peluquería puedan acceder a ellos en el futuro. A partir de este relevamiento de requerimientos, se establece lo siguiente:

![app1](https://github.com/user-attachments/assets/4856820d-2b8c-4c1c-92de-d3c3d053279a)

## Almacenamiento en Base de Datos

Esta aplicación de escritorio registra en una base de datos los datos tanto de mascotas como de dueños que se ingresen desde la interfaz gráfica de usuario basado en los conceptos del MODELO DE CAPAS.

## Datos de la Mascota
- **idMascota:** Identificador único de la mascota.
- **nombreMascota:** Nombre de la mascota.
- **raza:** Raza de la mascota.
- **color:** Color de la mascota.
- **alérgico:** Indicador de si la mascota es alérgica.
- **atenciónEspecial:** Necesidad de atención especial para la mascota.
- **observaciones:** Observaciones adicionales sobre la mascota.

## Datos del Dueño
- **idDuenio:** Identificador único del dueño.
- **nombreDuenio:** Nombre del dueño.
- **celular:** Número de celular del dueño.
- **dirección:** Dirección del dueño.

![app2](https://github.com/user-attachments/assets/29702526-ca69-445d-b939-af5f350c617e)

## Uso de la Aplicación

1. **Registro de Mascotas:**
   - Completa el formulario con los datos de la mascota y su dueño.
   - Recuerda registrar un dueño antes de registrar la mascota.

2. **Visualización de Datos:**
   - La aplicación permitirá visualizar, editar y/o eliminar los datos registrados previamente.

![app3](https://github.com/user-attachments/assets/b7cc37d4-4320-473d-9895-5e1700e030f6)

3. **Interfaz Gráfica Atractiva:**
   - La aplicación implementa una interfaz gráfica intuitiva para una experiencia de usuario atractiva.

## Requisitos

- JDK 17.0.6
- Algún Sistema Gestor de Base de Datos (SGBD)
- Importar al Gestor de Base de Datos el archivo .sql (ubicado en la carpeta resources) para poder hacer uso de la persistencia en la aplicación.

## Créditos

- **Desarrollado por**: Lautaro Tomás Israel Petelin
- **Tecnologías utilizadas**: Java 17.0.6, XAMPP
- **IDE**: Netbeans 17
- **Autor de la consigna**: Luisina de Paula / TodoCode

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una pull request.

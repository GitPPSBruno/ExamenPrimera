# Obtenemos una imagen de la última version de Ubuntu
FROM ubuntu:latest

# Hacemos un update de los repositorios de ubuntu
RUN apt update -y

# Ahora debemos de instalar tzdata por que sino no nos funciona la instalacion de PHP.
RUN DEBIAN_FRONTEND=noninteractive apt-get install -y tzdata

#Una vez tenemos instalado y configurado tzdata, debemos de instalar los repositorios de php, apache, 7zip y curl necesarios, para que funcione la aplicacion web. Una vez instalado todo debemos de borrar las librerias que hemos utilizado para que la maquina pese poco. 
RUN apt-get update -y && apt-get install apache2 php curl libapache2-mod-php -y && rm -rf /var/lib/apt/lists/*

#Debemos de movernos al directorio de /var/www/html
WORKDIR /var/www/html


#Ahora debemos de descargar el codigo de la aplicacion PHP que vamos a utilizar.
RUN curl -O https://gist.githubusercontent.com/galcober/1825545/raw/3521b89f6620ea2361d528fb7cbd318889177a34/holamundo.php

#Si queremos que se vea cuando iniciemos el apache debemos de cambiarle el nombre a index.php y eliminar el index.html de /var/www/html
RUN rm index.html -f && mv holamundo.php index.php

#Ahora debemos de exponer el puerto 80 del contenedor
EXPOSE 80

#Por ultimo debemos de hacer que apache2 corra como un demonio al iniciar el contenedor.
CMD ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
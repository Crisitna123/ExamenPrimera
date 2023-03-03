#A partir de una imagen de Ubuntu
FROM ubuntu
#Hace un update y que no haga la instalación interactiva
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt install -y tzdata
#Instala Apache
RUN apt-get install apache2 -y
#Indicamos que exponga el puerto 80
EXPOSE 80
#Instala php y sus librerias necesarias para apache2
RUN apt-get install -y php 
RUN apt-get install -y libapache2-mod-php
RUN apt-get install -y apache2-utils
#Instala Git
RUN apt-get install -y git 
#Crea la carpeta php
RUN mkdir php
#Se posiciona en la carpeta /var/www/html que es la página en la que expone las apps Apache
WORKDIR /var/www/html
#Descarga la aplicación de git
RUN git clone https://github.com/segundogaldames/axiomaframe.git
#Configuramos apache modo demonio
CMD ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]

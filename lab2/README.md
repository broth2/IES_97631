ligar o tomcat com o bin/startup.sh

ver se esta online:
$ curl -I 127.0.0.1:8080 
http://localhost:8080
$ tail logs/catalina.out

mvn install  ---->

ficheiros .war sao a aplicacao num pacote de web archive
colocar na pasta tomcat/webapps

fazer alteracoes, compilar, deploy .war, aceder a localhost:port/appname/javaclassname

request.getParameter("name") faz com que se adiconado ao url ?name=user1, seja apresentado user1

./localhost.[DATA].log guarda os erros

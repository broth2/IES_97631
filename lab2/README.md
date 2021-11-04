ligar o tomcat com o bin/startup.sh

ver se esta online:
$ curl -I 127.0.0.1:8080 
http://localhost:8080
$ tail logs/catalina.out

mvn install  ----> instalar dependencias, cria pasta target

ficheiros .war sao a aplicacao num pacote de web archive
colocar na pasta tomcat/webapps

fazer alteracoes, compilar, deploy .war, aceder a localhost:port/appname/javaclassname

request.getParameter("name") faz com que se adiconado ao url ?name=user1, seja apresentado user1

./localhost.[DATA].log guarda os erros

mvn clean package
mvn exec:java -Dexec.mainClass="[PACKAGE.CLASS NAME HERE]" -> corre o programa
aceder a localhost:PORT

PS1='\u:\W\$ ' encurtar caminho na bash


https://code.visualstudio.com/docs/java/java-spring-boot vs code extension  

Com o spring boot é só fazer build e ir a http://localhost:8080
build:
mvn install -DskipTests && java -jar target/spring-0.0.1-SNAPSHOT.jar
./mvnw spring-boot:run


explicacao das annotation e controllers
https://spring.io/guides/gs/serving-web-content/

sempre que uma @Annotation referencia um endereço (ex: /greeting), precisa de ser criado um greeting.html

./mvnw spring-boot:run ----> correr a aplicacao

./mvnw clean package
java -jar target/[JAR-FILE-NAME].jar -------------> criar um jar e correr o jar

index.html esta reservado para o endereco root, esta na pasta static porque nao tem variaveis nem nada a renderizar

o greeting controller transforma os pedidos GET de /greeting em objetos/instancias da class Greeting

web controller != resource controller


REVIEW QUESTIONS:
A) Os servlets recebem e respondem aos pedidos dos clientes depois de estes serem processados pelo container

B) O model esta representado nos dados da aplicação, o view nos ficheiros html e o controller é a ponte entre os dois, interceptando os pedidos, faz a conversão para a estrutura interna da aplicação, envia os dados para o model para depois serem apresentados no view. O DispatcherServlet é esse controller que retorna a data em json através de respostas HTTP

C) As starter dependecies, trazem as funcionalidades todas das dependencies generalizadas, não havendo necessidade de especificar todas as dependencies

D)@EnableAutoConfiguration, @ComponentScan, @Configuration

E) Retornar códigos de erro standard e lidar de forma siplificada com eles
    Haver controlo aos acessos e boas práticas de segurança
    Criar caches de dados para otimizar a performance
    Usar json para todas as comunicações
    Permitir filtragem e paginação, no caso de bases de dados enormes, também para otimizar a performance
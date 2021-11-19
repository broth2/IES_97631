@Entity annotation  ----> perform CRUD operations on the domain entities

@NotBlank ----> use Hibernate Validator before commiting changes to database

view layer vai para a pasta /templates

./mvnw spring-boot:run

<form action="#" th:action="@{/adduser}" th:object="${user}" method="post"> --------> investigar isto

### 3.1-b)
	-através da @Autowired annotation, é criada uma instância de UserRepository no construtor de UserController
	-métodos invocados: findAll(), save(), findById() and delete(). Estão definidos em CrudRepository
	-os dados estão a ser guardados na h2database atraves da dependencia
	-na classe User atraves da anotacao @NotBlank


docker run --name mysql5 -e MYSQL_ROOT_PASSWORD=secret1 -e MYSQL_DATABASE=demo -e MYSQL_USER=demo -e MYSQL_PASSWORD=secret2 -p 3306:3306 -d mysql/mysql-server:5.7

POSTMAN:
POST->inserir
GET->ver
DELETE->apagar
PUT->update

o Spring Data JPA cria implementacoes automaticamente, so precisa de ter o mesmo nome da variavel da classe


mvn install -DskipTests -> criar o jar para separar no docker, nao faz testes, assim nao da erros porque nao testa a base de dados que ainda nao foi ligada


## REVIEW QUESTIONS
A)@RestController faz com que nao tenhamos de adicionar @RequestBody a todos os handlers, tratando dos REST services. Faz o que o @Controller e o @ResponseBody fazem.

B) ./diagrama.uxf

C)Essas anotacoes servem para traduzir as funcionalidades de Table, Column e Id das bases de dados para as classes de java

D)A anotacao @AutoWired liga o Controller aos dois repository/service
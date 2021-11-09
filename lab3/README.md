@Entity annotation  ----> perform CRUD operations on the domain entities

@NotBlank ----> use Hibernate Validator before commiting changes to database

view layer vai para a pasta /templates

<form action="#" th:action="@{/adduser}" th:object="${user}" method="post"> --------> investigar isto

### 3.1-b)
	através da @Autowired annotation, é criada uma instância de UserRepository no construtor de UserController
	métodos invocados: findAll(), save(), findById() and delete(). Estão definidos em CrudRepository

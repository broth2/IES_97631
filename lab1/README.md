# IES_97631
aulas práticas de IES

mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn exec:java -exec:mainClass="----" -D exec:cleanupDaemonThreads=false

mvn clean package -> limpar & compilar

mvn exec:java -Dexec.mainClass="[CLASS NAME HERE]" -> corre o programa

mvn exec:java -Dexec.mainClass="[CLASS NAME HERE]" -Dexec.args="[ARGS HERE]" -> corre o programa com args


git log --reverse --oneline  



docker ps, docker stop, docker rm
docker image ls
docker inspect <tag or id>


docker run -d -p 80:80 docker/getting-started  -> d manda para o background(detached), p especifica o port

docker build -t getting-started .    ->  cria novo container a partir do dockerfile na pasta especificada("."), t é human readable

um docker com persistant data: https://dzone.com/articles/postgresql-with-docker-quick-start
docker run --name pg-docker -e POSTGRES_PASSWORD=docker -e POSTGRES_DB=sampledb -e PGDATA=/tmp -d -p 5433:5432 -v ${PWD}:/var/lib/postgresql/data postgres:11


create dir, small script, dockerfile, docker services

http://localhost:5000 ------ http://127.0.0.1:5000

The new volumes key mounts the project directory (current directory) on the host to /code inside the container, allowing you to modify the code on the fly



REVIEW QUESTIONS:
A) The main phases of the default lifecycle work to deploy the project, these are an initial validation of the project for its requierments, compilation of the source code, testing the results, producing the packages, verify the previous state, installing the packages locally and finnaly deploying it for remote use

B) To streamline the building process using standardized methods, so its easier for a team of developers to work together

C)  git pull
    [make changes]
    git add [changed files]
    git commit -m "Sample text explaing changes"
    git push

D) Commit messages should be short and succint, written with basic english so its easier for everyone to understand. They should cover all your changes and sometimes even the reason for them, so your colleagues can understand even if they are working on another thing

E) So it adapts to our needs, optimizes the program, 
# IES_97631
aulas práticas de IES

mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn exec:java -exec:mainClass="----" -D exec:cleanupDaemonThreads=false

mvn clean package -> limpar & compilar

mvn exec:java -Dexec.mainClass="[CLASS NAME HERE]" -> corre o programa

mvn exec:java -Dexec.mainClass="[CLASS NAME HERE]" -Dexec.args="[ARGS HERE]" -> corre o programa com args


git log --reverse --oneline  

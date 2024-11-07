# springboot-reactive-hexagonal
Arquitectura hexagonal con springboot reactivo.

# Doc
https://medium.com/@oliveraluis11/arquitectura-hexagonal-con-spring-boot-parte-1-57b797eca69c

https://gokhana.dev/spring-reactive-mongodb-implementation/

# Docker commands

docker compose up -d

# Command build with maven
mvn clean package -DskipTests

mvn clean package

# Docker commands
docker build -t hexagonal-tutorial:latest .

docker run -p 8080:8080 hexagonal-tutorial:latest
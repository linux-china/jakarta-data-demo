# build project
build:
  mvn -DskipTests clean package

# enter mysql cli
mysql:
  mysql -u root -p123456 jakarta
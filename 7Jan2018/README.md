# Links
- Git : [git-scm.com](https://git-scm.com/downloads)
- Heroku : [heroku.com](http://heroku.com)
- Heroku Command Line Tool : [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli#windows)
- Spring Boot Initializr : [start.spring.io](http://start.spring.io)
- Docker HUB : [hub.docker.com](http://hub.docker.com)
- OpenJDK image that we'd used : [frolvlad/alpine-oraclejdk8](https://hub.docker.com/r/frolvlad/alpine-oraclejdk8/)

# Required Step for all Below Commands

Open cmd anywhere and run `heroku login` and provide your heroku account credentials.

# Deploy Spring Boot Application to Heroku

- Open `cmd` in project root folder. Like this project root folder is **springBootApp**
- Run `git add .`
- Run `git commit -m "My Deploy-able App"`
- Run `heroku create`
- Run `git push heroku master`
- Finally view your live app with `heroku open`

# Create and Deploy Docker Containerized Spring App

- Open Your Application class containing main method and replace your main method with below one

```java
public static void main(String[] args) throws Exception {
 
    String ENV_PORT = System.getenv().get("PORT");
    if(ENV_PORT != null) {
        System.getProperties().put("server.port", ENV_PORT);
    }
 
    SpringApplication.run(Chatty.class, args);
}
```

- Open `cmd` in project root folder. Like this project root folder is **springBootApp**
- Run `mvnw package` to create ``jar`` file of your app
- Now point your `cmd` to target folder of your app by running `cd target`
- Create `Dockerfile` like below
```Dockerfile
#First we need to use alpine's JDK image as out base image
FROM frolvlad/alpine-oraclejdk8

#Now we have to create a directory in our container so our app can be copied inside it
RUN mkdir /app

#Now we are setting our working directory to newly created /app folder which will execute all future commands inside that directory
WORKDIR /app

#Now we need to add our jar file to container.  demo-0.0.1-SNAPSHOT.jar is the jar file name in our target folder and app.jar is the new file name which will be copied inside /app folder. Note the space between 
ADD demo-0.0.1-SNAPSHOT.jar app.jar

#Now finally we need to run our jar file using java runtime. Normally this command is written as java -jar app.jar but here we need to seperate each command with spaces like an array ["java","-jar","app.jar"] and CMD is used to run that command 
CMD ["java","-jar","app.jar"]
```
- Now save your file as `Dockerfile` **(Without any Extension)** 
- Now Run `heroku create` then you will get a app name like `dry-cliffs-62493`
- Now you need to build your docker image with heroku registery containing platform and app name. Now Run `docker image build -t registry.heroku.com/app-name/web`. Therefore you need to replace **`app-name`** with your heroku app name like `dry-cliffs-62493` so assuming this app name, your docker image will be built by `docker image build -t registry.heroku.com/dry-cliffs-62493/web`.
- This will build your image and now push it to heroku by running `docker push registry.heroku.com/app-name/web`
- Now your open your app with `heroku open` or open the url as `https://app-name.herokuapp.com` and yes **`app-name`** should be replaced with your **heroku app name**
# SPRING BOOT BOILERPLATE WITH JAX-RS ANNOTATIONS

This project includes a very basic boilerplate code to build JAX-RS API's with Spring boot and Jersey.

## Run

To run the demo application just execute this command in the root directory:

``
mvn spring-boot:run
``

And navigate to http://localhost:8080/ping

That's it! Jersey scans automatically all JAX-RS annotations in your project and creates endpoints from them. Spring boot takes care of web serving executing an embedded Tomcat.
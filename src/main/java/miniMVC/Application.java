package miniMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/********************************************************************
 *  AUFGABE
 *
 *  SpringMVC-Anwendung mit einer simplen Text-Wiedergabe (Darstellung) im Web-Browser.
 *  Die Anwendung sollte mit Java8 und auf Tomcat8 laufen.
 *  Es ist wünschenswert, dass Spring Boot verwendet wird.
 *  Zusätzlich wird 1 REST-Microservice (mit Spring) benötigt,
 *  dass die Inhalte der Hauptanwendung liefern soll.
 *
 ********************************************************************/

/**
 * Created by asztrik on 1/10/16.
 *
 * Application - SpringBoot Eintrittspunkt
 * Anwendung läuft mit Tomcat8, erreichbar unter miniMVC-1/miniMVC
 *
 * MODEL        ist die Uhrzeit MicroService, die die Inhalte gibt (Zeit und Datum einfach)
 *              --> UhrzeitMicroService.java
 *
 * VIEW         ist durch eine .jsp Seite verwirklicht, welche die Inhalte im Browser formatiert ausgibt
 *              --> view.jsp
 *
 * CONTROLLER   ist verantwortlich für die Behandlung vom REST Microservice, fragt die Daten ab und
 *              organisiert das View.
 *              --> MiniController.java
 *
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
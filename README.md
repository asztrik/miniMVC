# miniMVC
Bewerbung6Aufgabe Teil 1

 Anwendung läuft mit Tomcat8, erreichbar unter miniMVC-1/miniMVC
 Die WAR file is hier zu finden: https://drive.google.com/file/d/0B6fEoy27bMN1d05JY3J1SkdJQjA/view?usp=sharing

- MODEL        ist die Uhrzeit MicroService, die die Inhalte gibt (Zeit und Datum einfach), die durch eine REST Service ankommen

- VIEW         ist durch eine .jsp Seite verwirklicht, welche die Inhalte im Browser formatiert ausgibt
              --> view.jsp

- CONTROLLER   ist verantwortlich für die Behandlung vom REST Microservice, fragt die Daten ab und
              organisiert das View.
              --> MiniController.java
              

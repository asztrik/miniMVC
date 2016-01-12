package miniMVC;

/**
 * Created by asztrik on 1/12/16.
 *
 * Objekt die die REST Template ausfüllt, enspricht den Format
 * des Microservice
 *
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Uhrzeit {

    private String content;
    private String name;

    public Uhrzeit() {}

    public void setContent(String uz) {
        this.content = uz;
    }

    public void setName(String nm) { this.name = nm; }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Uhrzeit{" +
                "uhrzeit=" + content + "name=" + name +
                '}';
    }


}

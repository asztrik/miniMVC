package miniMVC.controller;

import miniMVC.Uhrzeit;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;

/**
 * Created by asztrik on 1/10/16.
 * Controller-Class, nimmt die REST Microservice, und richtet
 * ein JSP View ein.
 */


@Controller
public class MiniController {



    @RequestMapping(method = RequestMethod.GET, value = "/miniMVC")
    @ResponseStatus(HttpStatus.OK)
    public String sayIt(ModelMap model) {
        RestTemplate rT = new RestTemplate();
        Uhrzeit uhrzeit = rT.getForObject("http://localhost:1111/uhrzeit", Uhrzeit.class);

        model.put("msg", "Es ist genau");
        model.put("servicename", uhrzeit.getName());
        model.put("uhrzeit", uhrzeit.getContent());
        return "view";
    }

}
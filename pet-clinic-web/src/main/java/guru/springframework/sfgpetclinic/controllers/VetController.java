package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adetola on 18/06/2019
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vet/index.html"})
    public String listVets(){

        return "vets/index";
    }
}

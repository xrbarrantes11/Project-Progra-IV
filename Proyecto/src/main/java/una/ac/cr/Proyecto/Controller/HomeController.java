package una.ac.cr.Proyecto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    
@RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @PostMapping(value = "/validar", params = {"cedula"})
    public String getSalas(@RequestParam String cedula) {
    if(validar()&&cedula.equals("402320535")){
    System.out.println("Entro");
    return "indexEstudiantes";
    }else{
    return "index";
    }   
    }
    
    public boolean validar(){
    return true;
    }
    
}
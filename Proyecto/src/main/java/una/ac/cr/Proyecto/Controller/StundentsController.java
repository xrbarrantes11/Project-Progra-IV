package una.ac.cr.Proyecto.Controller;

import una.ac.cr.Proyecto.Domain.Curso;
import java.util.LinkedList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StundentsController {
    
        @GetMapping("/listar")
        public String getEstudiantes(Model model) {
        model.addAttribute("lista", getEstudiantes());
        return "listarCursosMatricula";
    }
        private LinkedList<Curso> getEstudiantes() {
        LinkedList<Curso> listado = new LinkedList();
        Curso cu = new Curso(1,"Matematicas","rffrr","Cuarto");
        listado.add(cu);
        return listado;
    }
}

package tallerlenguajes.proyecto2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tallerlenguajes.proyecto2.Modelos.Entities.DAO.IClienteDAO;

@Controller
public class ClienteControlador {
    @Autowired
    private IClienteDAO clienteDAO;

    @GetMapping("/listar")
    public String listar(Model model){

        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteDAO.findAll());

        return "listar";
    }
}

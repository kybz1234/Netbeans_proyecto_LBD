package com.proyecto.lenguajes.controllers;

import com.proyecto.lenguajes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class basicController {

    //@RequestMapping(method=RequestMethod.GET)
    @GetMapping(path = "/login")
    public String login(){
        return "index";
    }

    @GetMapping(path = "/registro")
    public String register(){
        return "registro";
    }

     @GetMapping(path = "/home")
    public String home(){
        return "home";
    }

    @Autowired
    private ProductoService productoService;
    @GetMapping("/tienda")
    public String listarProductos(Model model){
    model.addAttribute("Productos", productoService.listarProductos());
        return "tienda";
    }

        @GetMapping(path = "/acerca")
    public String about(){
        return "acerca";
    }

            @GetMapping(path = "/contacto")
    public String contact(){
        return "contacto";
    }

                @GetMapping(path = "/producto")
    public String item(){
        return "producto";
    }

}

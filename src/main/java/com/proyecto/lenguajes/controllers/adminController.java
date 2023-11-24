package com.proyecto.lenguajes.controllers;

import com.proyecto.lenguajes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/admin")
public class adminController {

    @Autowired
    private ProductoService productoService;
    @GetMapping(path = "/home")
    public String listarProductos(Model model){
    model.addAttribute("Productos", productoService.listarProductos());
        return "adminHome";
    }
    
}

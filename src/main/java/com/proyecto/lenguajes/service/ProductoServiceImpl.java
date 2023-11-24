/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.lenguajes.service;

import com.proyecto.lenguajes.entity.Producto;
import com.proyecto.lenguajes.repo.ProductoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cquir
 */

@Service("ProductoService")
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepo repo;
    @Override
    public List<Producto> listarProductos() {
       
        return repo.findAll();
    }
    
}

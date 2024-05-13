package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.services.Impl.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/categoria")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl>{
    public CategoriaController(CategoriaServiceImpl servicio) {
        super(servicio);
    }
}

package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.services.Impl.ArticuloManufacturadoServiceImpl;
import com.example.buensaboruno.services.Impl.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/producto")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl>{
    public ArticuloManufacturadoController(ArticuloManufacturadoServiceImpl servicio) {
        super(servicio);
    }
}

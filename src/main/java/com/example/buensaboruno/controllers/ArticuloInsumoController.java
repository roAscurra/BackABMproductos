package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.services.Impl.ArticuloInsumoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/articuloInsumo")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl> {
    public ArticuloInsumoController(ArticuloInsumoServiceImpl servicio) {
        super(servicio);
    }
}


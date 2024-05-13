package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.services.Impl.ArticuloManufacturadoDetalleServiceImpl;
import com.example.buensaboruno.services.Impl.ArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/articuloManufacturadoDetalle")
public class ArticuloManufacturadoDetalleController extends BaseControllerImpl<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleServiceImpl> {

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleServiceImpl servicio) {
        super(servicio);
    }
}

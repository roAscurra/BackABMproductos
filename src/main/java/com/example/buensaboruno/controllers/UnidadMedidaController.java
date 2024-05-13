package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.UnidadMedida;
import com.example.buensaboruno.services.Impl.UnidadMedidaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/unidadMedida")
public class UnidadMedidaController extends BaseControllerImpl <UnidadMedida, UnidadMedidaServiceImpl> {
    public UnidadMedidaController(UnidadMedidaServiceImpl servicio) {
        super(servicio);
    }
}

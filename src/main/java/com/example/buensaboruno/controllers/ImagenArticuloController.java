package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ImagenArticulo;
import com.example.buensaboruno.services.Impl.ImagenArticuloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/imagenArticulo")
public class ImagenArticuloController extends BaseControllerImpl<ImagenArticulo, ImagenArticuloServiceImpl>{
    public ImagenArticuloController(ImagenArticuloServiceImpl servicio) {
        super(servicio);
    }
}
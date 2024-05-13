package com.example.buensaboruno.services.Impl;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.services.ArticuloManufacturadoService;
import com.example.buensaboruno.services.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service

public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    public ArticuloManufacturadoServiceImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }
}

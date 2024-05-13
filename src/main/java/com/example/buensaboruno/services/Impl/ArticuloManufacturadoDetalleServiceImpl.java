package com.example.buensaboruno.services.Impl;

import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.services.ArticuloManufacturadoDetalleService;
import com.example.buensaboruno.services.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleServiceImpl extends BaseServiceImpl<ArticuloManufacturadoDetalle, Long> implements ArticuloManufacturadoDetalleService {
    public ArticuloManufacturadoDetalleServiceImpl(BaseRepository<ArticuloManufacturadoDetalle, Long> baseRepository) {
        super(baseRepository);
    }
}

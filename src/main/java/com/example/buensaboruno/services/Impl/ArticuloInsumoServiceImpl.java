package com.example.buensaboruno.services.Impl;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.services.ArticuloInsumoService;
import com.example.buensaboruno.services.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service

public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService {
    public ArticuloInsumoServiceImpl(BaseRepository<ArticuloInsumo, Long> baseRepository) {
        super(baseRepository);
    }
}

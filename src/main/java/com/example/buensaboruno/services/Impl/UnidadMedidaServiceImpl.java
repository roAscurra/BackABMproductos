package com.example.buensaboruno.services.Impl;

import com.example.buensaboruno.domain.entities.UnidadMedida;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.services.BaseServiceImpl;
import com.example.buensaboruno.services.UnidadMedidaService;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements UnidadMedidaService {
    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida, Long> baseRepository) {
        super(baseRepository);
    }
}

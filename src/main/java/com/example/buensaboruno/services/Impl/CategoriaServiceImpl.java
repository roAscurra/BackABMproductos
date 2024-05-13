package com.example.buensaboruno.services.Impl;

import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.services.BaseServiceImpl;
import com.example.buensaboruno.services.CategoriaService;
import org.springframework.stereotype.Service;

@Service

public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {
    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository);
    }
}

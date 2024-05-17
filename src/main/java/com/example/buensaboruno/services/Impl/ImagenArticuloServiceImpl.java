package com.example.buensaboruno.services.Impl;

import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.domain.entities.ImagenArticulo;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.services.BaseServiceImpl;
import com.example.buensaboruno.services.CategoriaService;
import com.example.buensaboruno.services.ImagenArticuloService;
import org.springframework.stereotype.Service;

@Service
public class ImagenArticuloServiceImpl extends BaseServiceImpl<ImagenArticulo, Long> implements ImagenArticuloService {

    public ImagenArticuloServiceImpl(BaseRepository<ImagenArticulo, Long> baseRepository) {
        super(baseRepository);
    }
}

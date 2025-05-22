package com.perfulandia.descuento_service01.service;

import com.perfulandia.descuento_service01.model.Descuento;
import com.perfulandia.descuento_service01.repository.DescuentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescuentoService {

    private final DescuentoRepository repository;

    public DescuentoService(DescuentoRepository repository) {
        this.repository = repository;
    }

    public Descuento guardar(Descuento descuento) {
        return repository.save(descuento);
    }

    public List<Descuento> listarTodos() {
        return repository.findAll();
    }
}

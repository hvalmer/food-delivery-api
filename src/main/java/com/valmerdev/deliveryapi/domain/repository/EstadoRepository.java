package com.valmerdev.deliveryapi.domain.repository;

import com.valmerdev.deliveryapi.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listar();
    Estado buscar(Long id);
    Estado salvar(Estado estado);
    void remover(Estado estado);
}

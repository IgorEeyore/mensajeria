package com.tienda.mensajeria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.mensajeria.model.Mensajeria;
import com.tienda.mensajeria.repository.MensajeriaRepository;

@Service 
public class MensajeriaService {
    private final MensajeriaRepository repository;

    public MensajeriaService(MensajeriaRepository repository){
        this.repository = repository;
    }

    public Mensajeria guardar(Mensajeria contacto){
        contacto.setId(null);
        contacto.setEstado("PENDIENTE");
        return repository.save(contacto);
    }

    public List<Mensajeria> listar(){
        return repository.findAll();
    }
    
}

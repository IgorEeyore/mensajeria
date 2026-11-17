package com.tienda.mensajeria.controller;

import java.util.List;

import com.tienda.mensajeria.model.Mensajeria;
import com.tienda.mensajeria.service.MensajeriaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping ("/api/contactos")
@CrossOrigin(origins = "http://localhost:5173")
public class MensajeriaController {
    private final MensajeriaService service;

    public MensajeriaController(MensajeriaService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Mensajeria> guardar(@RequestBody Mensajeria contacto){
        Mensajeria guardado = service.guardar(contacto);

        return ResponseEntity.status((HttpStatus.CREATED)).body(guardado);
    }

    @GetMapping
    public List<Mensajeria> listar(){
        return service.listar();
    }
}
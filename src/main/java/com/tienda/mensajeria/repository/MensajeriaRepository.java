package com.tienda.mensajeria.repository;

import com.tienda.mensajeria.model.Mensajeria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeriaRepository extends JpaRepository<Mensajeria, Long> {
}
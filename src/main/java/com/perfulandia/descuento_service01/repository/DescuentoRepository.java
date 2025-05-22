package com.perfulandia.descuento_service01.repository;

import com.perfulandia.descuento_service01.model.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescuentoRepository extends JpaRepository<Descuento, Integer> {
}
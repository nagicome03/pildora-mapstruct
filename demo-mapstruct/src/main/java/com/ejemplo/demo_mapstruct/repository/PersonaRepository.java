package com.ejemplo.demo_mapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejemplo.demo_mapstruct.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}

package com.ejemplo.demo_mapstruct.service;

import org.springframework.stereotype.Service;

import com.ejemplo.demo_mapstruct.dto.PersonaDTO;
import com.ejemplo.demo_mapstruct.entity.Persona;
import com.ejemplo.demo_mapstruct.mapper.PersonaMapper;
import com.ejemplo.demo_mapstruct.repository.PersonaRepository;

@Service
public class PersonaService {
    private final PersonaRepository repository;
    private final PersonaMapper mapper;

    public PersonaService(PersonaRepository repository, PersonaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public PersonaDTO save(PersonaDTO dto) {

        Persona persona = mapper.toEntity(dto);

        Persona saved = repository.save(persona);

        return mapper.toDTO(saved);

    }
}

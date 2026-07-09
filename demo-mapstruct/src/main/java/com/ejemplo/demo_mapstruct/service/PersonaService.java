package com.ejemplo.demo_mapstruct.service;

import org.springframework.stereotype.Service;

import com.ejemplo.demo_mapstruct.dto.PersonaRequestDTO;
import com.ejemplo.demo_mapstruct.dto.PersonaResponseDTO;
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

    public PersonaResponseDTO save(PersonaRequestDTO dto) {

        Persona persona = mapper.toEntity(dto);

        Persona saved = repository.save(persona);

        return mapper.toDTO(saved);

    }

    public PersonaResponseDTO findById(Long id) {
    Persona persona = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Persona no encontrada"));
    return mapper.toDTO(persona);
}
}

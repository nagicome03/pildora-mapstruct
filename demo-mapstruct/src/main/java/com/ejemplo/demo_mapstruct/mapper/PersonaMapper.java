package com.ejemplo.demo_mapstruct.mapper;

import org.springframework.stereotype.Component;

import com.ejemplo.demo_mapstruct.dto.PersonaRequestDTO;
import com.ejemplo.demo_mapstruct.dto.PersonaResponseDTO;
import com.ejemplo.demo_mapstruct.entity.Persona;

@Component
public class PersonaMapper {
public Persona toEntity(PersonaRequestDTO dto) {

        Persona persona = new Persona();

        persona.setName(dto.getName());
        persona.setSurname(dto.getSurname());
        persona.setEmail(dto.getEmail());
        persona.setPhone(dto.getPhone());
        persona.setDireccion(dto.getDirection());
        persona.setBirthdate(dto.getBirthdate());
        persona.setActive(dto.getActive());

        return persona;
    }

    public PersonaResponseDTO toDTO(Persona persona) {

        PersonaResponseDTO dto = new PersonaResponseDTO();

        dto.setId(persona.getId());
        dto.setName(persona.getName());
        dto.setSurname(persona.getSurname());
        dto.setEmail(persona.getEmail());
        dto.setPhone(persona.getPhone());
        dto.setDirection(persona.getDireccion());
        dto.setBirthdate(persona.getBirthdate());
        dto.setActive(persona.getActive());

        return dto;
    }
}

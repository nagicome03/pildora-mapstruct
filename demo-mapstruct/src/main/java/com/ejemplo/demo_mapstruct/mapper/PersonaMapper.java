package com.ejemplo.demo_mapstruct.mapper;

import org.springframework.stereotype.Component;
import com.ejemplo.demo_mapstruct.dto.PersonaDTO;
import com.ejemplo.demo_mapstruct.entity.Persona;

@Component
public class PersonaMapper {
public Persona toEntity(PersonaDTO dto) {

        Persona persona = new Persona();

        persona.setName(dto.getName());
        persona.setSurname(dto.getSurname());
        persona.setEmail(dto.getEmail());
        persona.setPhone(dto.getPhone());
        persona.setDirection(dto.getDirection());
        persona.setBirthdate(dto.getBirthdate());
        persona.setActive(dto.getActive());

        return persona;
    }

    public PersonaDTO toDTO(Persona persona) {

        PersonaDTO dto = new PersonaDTO();

        dto.setId(persona.getId());
        dto.setName(persona.getName());
        dto.setSurname(persona.getSurname());
        dto.setEmail(persona.getEmail());
        dto.setPhone(persona.getPhone());
        dto.setDirection(persona.getDirection());
        dto.setBirthdate(persona.getBirthdate());
        dto.setActive(persona.getActive());

        return dto;
    }
}

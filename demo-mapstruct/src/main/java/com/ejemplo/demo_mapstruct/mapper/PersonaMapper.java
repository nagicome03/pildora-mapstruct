package com.ejemplo.demo_mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ejemplo.demo_mapstruct.dto.PersonaRequestDTO;
import com.ejemplo.demo_mapstruct.dto.PersonaResponseDTO;
import com.ejemplo.demo_mapstruct.entity.Persona;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    @Mapping(source = "direction", target = "direccion")
    Persona toEntity(PersonaRequestDTO dto);

    PersonaResponseDTO toDTO(Persona persona);

}

package com.ejemplo.demo_mapstruct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.demo_mapstruct.dto.PersonaRequestDTO;
import com.ejemplo.demo_mapstruct.dto.PersonaResponseDTO;
import com.ejemplo.demo_mapstruct.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @PostMapping
    public PersonaResponseDTO save(@RequestBody PersonaRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping("/{id}")
    public PersonaResponseDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}

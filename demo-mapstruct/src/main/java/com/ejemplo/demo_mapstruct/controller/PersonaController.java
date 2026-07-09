package com.ejemplo.demo_mapstruct.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.demo_mapstruct.dto.PersonaDTO;
import com.ejemplo.demo_mapstruct.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @PostMapping
    public PersonaDTO save(@RequestBody PersonaDTO dto) {
        return service.save(dto);
    }
}

package com.ejemplo.demo_mapstruct.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaResponseDTO {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String direction;
    private LocalDate birthdate;
    private Boolean active;
}

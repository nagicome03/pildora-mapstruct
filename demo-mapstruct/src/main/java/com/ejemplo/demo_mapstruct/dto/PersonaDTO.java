package com.ejemplo.demo_mapstruct.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {
    private Long id;

    private String name;

    private String surname;

    private String email;

    private String phone;

    private String direction;

    private LocalDate birthdate;

    private Boolean active;
}

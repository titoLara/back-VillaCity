package com.villacity.dto.Apoderado;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlumnoApoderadoDTO {

    @NotBlank
    private String sede;

    @NotBlank
    private String nombreAlumno;

    @NotBlank
    private String apellidoAlumno;


    @Size(min = 2, max = 2)
    private String condicion_medica;

    @Past
    private LocalDate fecha_nacimiento;

    @NotBlank(message = "El DNI no debe estar vacío")
    @Size(min = 8, max = 8, message = "El DNI debe tener exactamente 8 caracteres")
    private String dni;


}

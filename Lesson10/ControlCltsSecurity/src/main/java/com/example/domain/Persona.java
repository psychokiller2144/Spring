package com.example.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    //@Size(min=5, message="Su nombre debe contener al menos 5 caracteres")
    private String nombre;
    
    @NotEmpty
    //@Size(min=5, message="Su apellido debe contener al menos 5 caracteres")
    private String apellido;
    
    @NotEmpty
    private String email;
    
    //@NotEmpty(message="Debe colocar algun telefono")
    //@Digits(integer=10, fraction=0, message="El numero telefonico debe tener 10 digitos")
    @Pattern(regexp="\\d{10}")
    private String telefono;
}

package com.example.buensaboruno.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
//@Audited
public class Empresa extends Base{

    private String nombre;
    private String razonSocial;
    private Long cuil;

    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("empresa")
    @ToString.Exclude
    @Builder.Default
    private Set<Sucursal> sucursales= new HashSet<>();
}

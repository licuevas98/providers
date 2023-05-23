package com.licuevas.providerservice.database.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "proveedores")
@Getter
@Setter
public class ProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor", nullable = false)
    private Long providerUid;

    @Column(name = "nombre")
    private String name;

    @Column(name = "fecha_alta")
    private Date date;

    @Column(name = "id_cliente")
    private Long clientUid;
}

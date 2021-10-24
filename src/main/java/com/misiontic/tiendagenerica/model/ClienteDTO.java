package com.misiontic.tiendagenerica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clientes")
public final class ClienteDTO {

    @Id
    private Long cedula_cliente;
    private String direccion_cliente;
    private String email_cliente;
    private String nombre_cliente;
    private String telefono_cliente;
    private Boolean disabled = false;



}

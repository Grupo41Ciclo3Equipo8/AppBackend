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
@Table(name = "proveedores")
public final class ProveedoresDTO {
    @Id
    private Long nit_proveedor;

    private String ciudad_proveedor;
    private String direccion_proveedor;
    private String nombre_proveedor;
    private String telefono_venta;

    private Boolean disabled = false;




}

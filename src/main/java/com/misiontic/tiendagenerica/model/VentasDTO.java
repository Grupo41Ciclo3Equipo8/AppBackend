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
@Table(name = "ventas")
public final class VentasDTO {

    @Id
    private Long codigo_venta;

    private Long cedula_cliente;
    private Long cedula_usuario;
    private double iva_venta;
    private double total_venta;
    private double valor_venta;





}

package com.everis.alicante.cobo2java.restaurate.domain;

import java.time.LocalDateTime;

public class Reserva {

  private Cliente cliente;
  private Mesa mesa;
  private LocalDateTime fecha;


  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Mesa getMesa() {
    return mesa;
  }

  public void setMesa(Mesa mesa) {
    this.mesa = mesa;
  }

  public LocalDateTime getFecha() {
    return fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  @Override
  public String toString() {
    return "Reserva [cliente=" + cliente + ", mesa=" + mesa + ", fecha=" + fecha + "]";
  }


}

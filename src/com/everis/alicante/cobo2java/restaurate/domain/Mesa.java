package com.everis.alicante.cobo2java.restaurate.domain;

import java.util.Objects;

public class Mesa {

  private Integer idMesa;
  private Integer numComensales;
  private boolean reservada;



  public Mesa(Integer idMesa, Integer numComensales) {
    this.idMesa = idMesa;
    this.numComensales = numComensales;
  }

  public Integer getIdMesa() {
    return idMesa;
  }

  public void setIdMesa(Integer idMesa) {
    this.idMesa = idMesa;
  }

  public Integer getNumComensales() {
    return numComensales;
  }

  public void setNumComensales(Integer numComensales) {
    this.numComensales = numComensales;
  }

  public boolean isReservada() {
    return reservada;
  }

  public void setReservada(boolean reservada) {
    this.reservada = reservada;
  }


  @Override
  public int hashCode() {
    return Objects.hash(idMesa);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Mesa other = (Mesa) obj;
    return Objects.equals(idMesa, other.idMesa);
  }

  @Override
  public String toString() {
    return "Mesa [idMesa=" + idMesa + ", numComensales=" + numComensales + ", reservada=" + reservada + "]";
  }



}

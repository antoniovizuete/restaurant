package com.everis.alicante.cobo2java.restaurate.menu;

public abstract class AbstractOpcion implements Opcion {

  private String texto;

  private Integer identificador;

  public AbstractOpcion(String texto, Integer identificador) {
    super();
    this.texto = texto;
    this.identificador = identificador;
  }

  public String getTexto() {
    return texto;
  }

  public Integer getIdentificador() {
    return identificador;
  }

  @Override
  public int compareTo(Opcion o) {
    return this.getIdentificador().compareTo(o.getIdentificador());
  }

  public String toString() {
    return "\t" + getIdentificador() + " - " + getTexto();
  }
}

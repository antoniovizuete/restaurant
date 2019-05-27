package com.everis.alicante.cobo2java.restaurate.menu;

public interface Opcion extends Comparable<Opcion> {

  String getTexto();

  Integer getIdentificador();

  void accionar();
}

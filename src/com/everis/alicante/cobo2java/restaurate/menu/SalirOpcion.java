package com.everis.alicante.cobo2java.restaurate.menu;

public class SalirOpcion extends AbstractOpcion {

  public SalirOpcion() {
    super("Salir", 99);
  }

  @Override
  public void accionar() {
    System.exit(0);
  }

}

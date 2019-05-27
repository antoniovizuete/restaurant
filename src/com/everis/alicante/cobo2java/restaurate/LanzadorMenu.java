package com.everis.alicante.cobo2java.restaurate;

import com.everis.alicante.cobo2java.restaurate.menu.Menu;

public class LanzadorMenu {

  public static void main(String[] args) {
    LanzadorMenu lanzadorMenu = new LanzadorMenu();
    lanzadorMenu.leerArgumentos(args);

    Menu menu = new Menu();
    menu.mostrarMenu();
  }

  private void leerArgumentos(String[] args) {
    try {
      Restaurante.getInstancia().setNumMaxMesas(Integer.parseInt(args[0]));
    } catch (NumberFormatException e) {
      System.err.println("Error en el formato del numero " + e.getMessage());
      System.exit(-1);
    }

    Restaurante.getInstancia().setNombreRestaurante(args[1]);
  }

}

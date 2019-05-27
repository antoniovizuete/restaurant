package com.everis.alicante.cobo2java.restaurate.menu;

import java.util.Set;
import java.util.TreeSet;

import com.everis.alicante.cobo2java.restaurate.Restaurante;

public class Menu {

  private Set<Opcion> opciones;

  public Menu() {
    opciones = new TreeSet<>();
    opciones.add(new ListarMesasOpcion());
    opciones.add(new ListarReservasOpcion());
    opciones.add(new NuevaReservaOpcion());
    opciones.add(new SalirOpcion());
  }

  public void mostrarMenu() {
    while (true) {
      cabeceraMenu();
      imprimirOpciones();
      ejecutarAccion(Restaurante.getInstancia().getScanner().nextInt());
    }
  }

  private void imprimirOpciones() {
    for (Opcion opcion : opciones) {
      System.out.println(opcion);
    }
  }

  private void ejecutarAccion(int idOpcion) {
    for (Opcion opcion : opciones) {
      if (opcion.getIdentificador() == idOpcion) {
        opcion.accionar();
        return;
      }
    }
    System.err.println("La opcion seleccionada no existe");
  }

  private void cabeceraMenu() {
    System.out.println("Bienvenido a " + Restaurante.getInstancia().getNombreRestaurante());
    System.out.println();
    System.out.println("Elija una opcion: ");
  }
}

package com.everis.alicante.cobo2java.restaurate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.everis.alicante.cobo2java.restaurate.domain.Mesa;
import com.everis.alicante.cobo2java.restaurate.domain.Reserva;

public final class Restaurante {

  private static Restaurante instancia;

  private Set<Mesa> mesas = new HashSet<>();
  private List<Reserva> reservas = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);
  private String nombreRestaurante;
  private Integer numMaxMesas;

  private Restaurante() {
    /* Private void constructor. */
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    scanner.close();
  }

  public static Restaurante getInstancia() {
    if (instancia == null) {
      instancia = new Restaurante();
    }
    return instancia;
  }

  public Set<Mesa> getMesas() {
    return mesas;
  }

  public List<Reserva> getReservas() {
    return reservas;
  }

  public Scanner getScanner() {
    return scanner;
  }

  public String getNombreRestaurante() {
    return nombreRestaurante;
  }

  public void setNombreRestaurante(String nombreRestaurante) {
    this.nombreRestaurante = nombreRestaurante;
  }

  public int getNumMaxMesas() {
    return numMaxMesas;
  }

  public void setNumMaxMesas(int numMaxMesas) {
    if (this.numMaxMesas == null) {
      this.numMaxMesas = numMaxMesas;
      cargarMesas();
    }
  }

  private void cargarMesas() {
    for (int i = 0; i < numMaxMesas; i++) {
      this.mesas.add(new Mesa(i + 1, 4));
    }
  }
}

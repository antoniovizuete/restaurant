package com.everis.alicante.cobo2java.restaurate.menu;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.everis.alicante.cobo2java.restaurate.Restaurante;
import com.everis.alicante.cobo2java.restaurate.domain.Cliente;
import com.everis.alicante.cobo2java.restaurate.domain.Mesa;
import com.everis.alicante.cobo2java.restaurate.domain.Reserva;

public class NuevaReservaOpcion extends AbstractOpcion {

  private Scanner scanner = Restaurante.getInstancia().getScanner();

  public NuevaReservaOpcion() {
    super("Nueva reserva", 3);
  }

  @Override
  public void accionar() {
    System.out.println("Introduzca el nombre del cliente:");
    String nombre = scanner.next();
    System.out.println("Introduzca el telefono del cliente:");
    String telefono = scanner.next();
    System.out.println("Introduzca la mesa elegida:");
    Integer mesaId = scanner.nextInt();
    System.out.println("Introduzca la fecha (YYYY-MM-DD):");
    String fecha = scanner.next();
    System.out.println("Introduzca la hora (HH:MM):");
    String hora = scanner.next();

    Cliente cliente = new Cliente();
    cliente.setNombre(nombre);
    cliente.setTelefono(telefono);

    Mesa mesaElegida = null;
    for (Mesa mesa : Restaurante.getInstancia().getMesas()) {
      if (mesa.getIdMesa().equals(mesaId)) {
        mesaElegida = mesa;
        break;
      }
    }

    if (mesaElegida == null) {
      System.err.println("La mesa no existe");
      return;
    }

    LocalDateTime fechaYHora = LocalDateTime.parse(fecha + "T" + hora + ":00");

    Reserva reserva = new Reserva();
    reserva.setCliente(cliente);
    reserva.setMesa(mesaElegida);
    reserva.setFecha(fechaYHora);
    reserva.getMesa().setReservada(true);

    Restaurante.getInstancia().getReservas().add(reserva);
  }

}

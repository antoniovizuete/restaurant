package com.everis.alicante.cobo2java.restaurate;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.everis.alicante.cobo2java.restaurate.domain.Cliente;
import com.everis.alicante.cobo2java.restaurate.domain.Mesa;
import com.everis.alicante.cobo2java.restaurate.domain.Reserva;

public class Lanzador {

  public static void main(String[] args) {

    while (true) {
      System.out.println("Bienvenido a Restaurante!");
      System.out.println();
      System.out.println("Elija una opcion: ");
      System.out.println("\t1 - Listar mesas reservadas");
      System.out.println("\t2 - Listar reservas");
      System.out.println("\t3 - Nueva reserva");
      System.out.println("\t4 - Anular reserva");
      System.out.println("\t99 - Salir");

      Scanner scanner = new Scanner(System.in);
      int opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          for (Mesa mesa : Restaurante.getInstancia().getMesas()) {
            if (mesa.isReservada()) {
              System.out.println(mesa);
            }
          }
          break;
        case 2:
          for (Reserva reserva : Restaurante.getInstancia().getReservas()) {
            System.out.println(reserva);
          }
          break;
        case 3:
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
            break;
          }

          LocalDateTime fechaYHora = LocalDateTime.parse(fecha + "T" + hora + ":00");

          Reserva reserva = new Reserva();
          reserva.setCliente(cliente);
          reserva.setMesa(mesaElegida);
          reserva.setFecha(fechaYHora);
          reserva.getMesa().setReservada(true);

          Restaurante.getInstancia().getReservas().add(reserva);

          break;
        case 99:
          System.exit(0);
        default:
          break;
      }

    }

  }

}

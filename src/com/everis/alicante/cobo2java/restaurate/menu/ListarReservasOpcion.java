package com.everis.alicante.cobo2java.restaurate.menu;

import com.everis.alicante.cobo2java.restaurate.Restaurante;
import com.everis.alicante.cobo2java.restaurate.domain.Reserva;

public class ListarReservasOpcion extends AbstractOpcion {

  public ListarReservasOpcion() {
    super("Listar reservas", 2);
  }

  @Override
  public void accionar() {
    for (Reserva reserva : Restaurante.getInstancia().getReservas()) {
      System.out.println(reserva);
    }
  }

}

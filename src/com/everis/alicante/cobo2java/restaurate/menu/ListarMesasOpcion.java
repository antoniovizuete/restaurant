package com.everis.alicante.cobo2java.restaurate.menu;

import com.everis.alicante.cobo2java.restaurate.Restaurante;
import com.everis.alicante.cobo2java.restaurate.domain.Mesa;

public class ListarMesasOpcion extends AbstractOpcion {

  public ListarMesasOpcion() {
    super("Listar mesas libres", 1);
  }

  @Override
  public void accionar() {
    for (Mesa mesa : Restaurante.getInstancia().getMesas()) {
      if (!mesa.isReservada()) {
        System.out.println(mesa);
      }
    }
  }

}

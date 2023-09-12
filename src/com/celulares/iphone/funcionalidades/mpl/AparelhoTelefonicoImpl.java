package com.celulares.iphone.funcionalidades.mpl;

import com.celulares.iphone.funcionalidades.AparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
  @Override
  public void fazerLigacao() {
    System.out.println("Fazendo ligação");
  }

  @Override
  public void atenderChamada() {
    System.out.println("Atendendo chamada");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }
}

package com.celulares.iphone.funcionalidades.mpl;

import com.celulares.iphone.funcionalidades.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
  @Override
  public void tocarMusica() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Pausando música");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando música");
  }
}

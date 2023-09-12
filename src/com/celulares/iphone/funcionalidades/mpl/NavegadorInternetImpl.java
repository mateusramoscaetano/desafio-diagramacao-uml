package com.celulares.iphone.funcionalidades.mpl;

import com.celulares.iphone.funcionalidades.NavegadorInternet;

public class NavegadorInternetImpl implements NavegadorInternet {
  @Override
  public void exibirPagina() {
    System.out.println("Exibindo página na Internet");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba no navegador");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página na Internet");
  }
}

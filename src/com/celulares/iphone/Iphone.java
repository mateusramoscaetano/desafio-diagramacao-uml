// Iphone.java
package com.celulares.iphone;

import com.celulares.iphone.funcionalidades.*;
import com.celulares.iphone.funcionalidades.mpl.AparelhoTelefonicoImpl;
import com.celulares.iphone.funcionalidades.mpl.NavegadorInternetImpl;
import com.celulares.iphone.funcionalidades.mpl.ReprodutorMusicalImpl;

public class Iphone {
  private ReprodutorMusical reprodutorMusical;
  private AparelhoTelefonico aparelhoTelefonico;
  private NavegadorInternet navegadorInternet;

  public Iphone() {
    reprodutorMusical = new ReprodutorMusicalImpl();
    aparelhoTelefonico = new AparelhoTelefonicoImpl();
    navegadorInternet = new NavegadorInternetImpl();
  }

  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.reprodutorMusical.selecionarMusica();
    iphone.reprodutorMusical.tocarMusica();
    iphone.reprodutorMusical.pausarMusica();

    iphone.aparelhoTelefonico.fazerLigacao();
    iphone.aparelhoTelefonico.atenderChamada();
    iphone.aparelhoTelefonico.iniciarCorreioVoz();

    iphone.navegadorInternet.adicionarNovaAba();
    iphone.navegadorInternet.atualizarPagina();
    iphone.navegadorInternet.exibirPagina();
  }
}

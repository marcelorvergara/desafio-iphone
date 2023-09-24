package com.apple.iphone.models;

import com.apple.iphone.interfaces.AparelhoTelefonico;
import com.apple.iphone.interfaces.NavegadorInternet;
import com.apple.iphone.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String nome;

    public iPhone(String nome) {
        this.nome = nome;
    }

    // Implementação da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música no " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no " + nome);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no " + nome);
    }

    // Implementação da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " do " + nome);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no " + nome);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no " + nome);
    }

    // Implementação da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no " + nome);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba para " + url + " no " + nome);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no " + nome);
    }
}
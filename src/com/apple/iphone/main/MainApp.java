package com.apple.iphone.main;

import com.apple.iphone.models.iPhone;

public class MainApp {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 8GB");
        meuIphone.tocar();
        meuIphone.ligar("21-4566-7890");
        meuIphone.exibirPagina("www.apple.com");
    }
}

package br.com.ebac.ordenacao;

import java.util.ArrayList;
import java.util.List;

public final class Aplicacao {
    public static void main(String[] args) {
        // ArrayList permite que Collections.sort reorganize os elementos.
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Teclado mecânico", 249.90));
        produtos.add(new Produto("Hub USB-C", 189.90));
        produtos.add(new Produto("Mouse", 89.90));

        // O compilador infere Produto como o tipo T do método genérico.
        ListaUtil.ordenarExibir(produtos);
    }
}

package br.com.ebac.ordenacao;

import java.util.Collections;
import java.util.List;

public final class ListaUtil {
    private ListaUtil() {
        // A classe oferece apenas métodos utilitários estáticos.
    }

    // O limite exige elementos com uma ordem natural compatível.
    // "? super T" também aceita Comparable definido para um supertipo de T.
    public static <T extends Comparable<? super T>> void ordenarExibir(List<T> lista) {
        // A ordenação modifica a própria lista recebida.
        Collections.sort(lista);
        for (T item : lista) {
            System.out.println(item);
        }
    }
}

package br.com.ebac.ordenacao;

import java.util.Locale;

// Comparable define a ordem natural dos produtos pelo preço.
public final class Produto implements Comparable<Produto> {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
        if (!Double.isFinite(preco) || preco < 0) {
            throw new IllegalArgumentException("O preço deve ser finito e maior ou igual a zero.");
        }
        this.nome = nome.strip();
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outro) {
        // Retorna negativo, zero ou positivo conforme a comparação dos preços.
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        // A localidade brasileira mantém a vírgula decimal na saída.
        return String.format(Locale.forLanguageTag("pt-BR"),
                "%s - R$ %.2f", nome, preco);
    }
}

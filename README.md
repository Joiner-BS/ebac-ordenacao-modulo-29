# Ordenação genérica — Exercício do Módulo 29

Projeto do curso Desenvolvedor Full Stack Java da EBAC.

## Objetivo

Ordenar produtos por preço crescente com Comparable e Collections.sort e exibi-los com um método genérico.

## Como executar no IntelliJ IDEA

1. Abra a pasta que contém este README.
2. Selecione o JDK 25.
3. Marque src como Sources Root se necessário.
4. Execute o método main de br.com.ebac.ordenacao.Aplicacao.

## Como executar no Git Bash

Na pasta do projeto:

```bash
javac -encoding UTF-8 -d out src/br/com/ebac/ordenacao/*.java
java -cp out br.com.ebac.ordenacao.Aplicacao
```

## Saída esperada

```text
Mouse - R$ 89,90
Hub USB-C - R$ 189,90
Teclado mecânico - R$ 249,90
```

## Classes

- Produto tem os atributos nome (String) e preco (double), implementa Comparable<Produto> com Double.compare e sobrescreve toString.
- ListaUtil oferece ordenarExibir com a assinatura genérica abaixo.
- Aplicacao cria uma List<Produto> com três produtos em ordem inicial diferente da ordem de preço e chama o método utilitário.

```java
public static <T extends Comparable<? super T>> void ordenarExibir(List<T> lista)
```

O método aceita listas de elementos com uma ordem natural compatível, como Produto, String e Integer. A ordenação usa Collections.sort e modifica a lista recebida, que precisa permitir a reorganização dos seus elementos. List.of cria listas imutáveis. A aplicação usa ArrayList.

Produtos com o mesmo preço têm compareTo igual a zero. Ambos continuam na lista e mantêm sua ordem relativa, pois Collections.sort é estável.

O exercício solicita double para preco e a implementação segue esse requisito. O construtor aceita preços finitos maiores ou iguais a zero e nomes preenchidos.

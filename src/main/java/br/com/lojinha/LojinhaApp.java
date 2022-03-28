package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
       Produto meuProduto = new Produto ("Nestle", Tamanho. MÉDIO);

       meuProduto.setNome ("Play station 4");
       meuProduto.setValor (30);


       List<ItemIncluso> itensInclusos = new ArrayList<>();

       ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
       itensInclusos.add(primeiroItemIncluso); // 0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso); // 1

        ItemIncluso terceitoItemIncluso = new ItemIncluso("Cabo de Energia",2);
        itensInclusos.add(terceitoItemIncluso); // 2

       meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram-se os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MÉDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MÉDIO);
        meuProdutoInternacional.setValor(-100);


    }
}

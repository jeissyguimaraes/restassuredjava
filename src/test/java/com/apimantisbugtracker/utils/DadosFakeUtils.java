package com.apimantisbugtracker.utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DadosFakeUtils {

    private static final Locale LOCALE = new Locale("pt-BR");


    public static String geraNomeUsuario(){
        Faker faker = new Faker(LOCALE);
        return faker.name().firstName();
    }

    public static String geraNomeRealCompleto(){
        Faker faker = new Faker(LOCALE);
        return faker.name().firstName() +" "+ faker.name().lastName();
    }

    public static String geraEmail(){
        Faker faker = new Faker(LOCALE);
        return faker.internet().emailAddress();
    }

    public static String geraNivelAcesso(){
        String[] opcoes = { "gerente", "relator", "visualizador", "atualizador", "desenvolvedor" };
       return opcoes[new Random().nextInt(opcoes.length)];
    }

    public static String gerarNomeProjeto(){
        String complemento ="";
        StringBuilder nomeProjeto = new StringBuilder();
        nomeProjeto.append("PROJETO MANTIS TESTE ");
        complemento = String.valueOf(new Random().nextInt(100));
        nomeProjeto.append(complemento);
        return nomeProjeto.toString();
    }

    public static String gerarDescricao() {
        StringBuilder nomeProjeto = new StringBuilder();
        nomeProjeto.append("DESCRIÇÃO PROJETO");
        return nomeProjeto.toString();
    }

}

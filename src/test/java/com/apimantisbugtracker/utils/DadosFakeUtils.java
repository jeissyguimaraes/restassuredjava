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

}

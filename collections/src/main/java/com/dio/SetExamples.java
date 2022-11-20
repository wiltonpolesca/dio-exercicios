package com.dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.dio.comparables.LanguageIdeComparator;
import com.dio.comparables.LanguageNameYearIdeComparator;
import com.dio.comparables.LanguageYearNameComparator;
import com.dio.models.*;

public class SetExamples {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Crie um conjunto contendo as cores do arco-íris e:
     *  A - Exiba todas as cores uma abaixo da outra
     *  B - A quantidade de cores que o arco-íris tem
     *  C - Exiba as cores em ordem alfabética
     *  D - Exiba as cores na ordem inversa da que foi informada
     *  E - Exiba todas as cores que começam com a letra 'V'
     *  F - Remova todas as cores que não começam com a letra 'V'
     *  G - Limpre o conjunto
     *  H - Confira se o conjunto está vazio
     * 
     */
    public static void exercice3 () {

        Set <String>  rainbownColors = new HashSet<>();
        rainbownColors.addAll(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"));

        System.out.println("---- Exercice 3 - Rainbow ---" );
        System.out.println("-- A - rainbow colors");
        for (String color : rainbownColors) {
            System.out.println(color);
        }

        System.out.println("-- B - rainbow colors number");
        System.out.println(rainbownColors.size());

        System.out.println("-- C - rainbow colors by name");
        SortedSet<String> named = new TreeSet<>();
        named.addAll(rainbownColors);

        for (String color : named) {
            System.out.println(color);
        }

        System.out.println("-- D - rainbow colors by name inversed");
        SortedSet<String> inversedNamed = new TreeSet<>(Collections.reverseOrder());
        inversedNamed.addAll(rainbownColors);
        for (String color : inversedNamed) {
            System.out.println(color);
        }

        System.out.println("-- E - rainbow colors where name stats with 'V'");
        for (String color : rainbownColors) {
            if (color.startsWith("V")) {
                System.out.println(color);
            } 
        }

        System.out.println("-- F - rainbow colors where name stats with 'V'");
        for (String color : rainbownColors) {
            if (!color.startsWith("V")) {
                System.out.println(color);
            } 
        }
        
        System.out.println("-- G - Clean the collection");
        rainbownColors.clear();

        System.out.println("-- H - Ensure that the collection is clean");
        System.out.println(rainbownColors.size());
    }

    /**
     * Crie uma classe linguagemFavorita que possua os atributos
     * Nome; anoDeCriação e IDE
     * Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene
     * ese conjunto por:
     * A - Ordem de inserção
     * B - Ordem Natural (nome)
     * C - IDE
     * D - Ano de criação e nome
     * E - Nome, Ano de criação e IDE
     * 
     * Ao final, exiba as linguagens no console, um abaixo do outro
     * 
     */
    public static void exercice4() {

        List<Language> languages = Arrays.asList(
             new Language("C#", 2002, "Visual Studio"),
             new Language("Angular", 2008, "Visual Studio Code"),
             new Language("Java", 1994, "Eclipse")
        );

        Set<Language> langs;

        langs = new LinkedHashSet<>();
        langs.addAll(languages);

        System.out.println("---- Exercice 4 - Program Languages ---" );
        System.out.println("-- A - Show inserted order");
        for (Language lang : langs) {
            System.out.println(lang);
        }

        System.out.println("-- B - Show natural order (name)");
        langs = new TreeSet<Language>(languages);
        for (Language lang : langs) {
            System.out.println(lang);
        }

        System.out.println("-- C - Show order by IDE");
        langs = new TreeSet<Language>(new LanguageIdeComparator());
        langs.addAll(languages);
        for (Language lang : langs) {
            System.out.println(lang);
        }

        System.out.println("-- D - Show order by year and name");
        langs = new TreeSet<Language>(new LanguageYearNameComparator());
        langs.addAll(languages);
        for (Language lang : langs) {
            System.out.println(lang);
        }

        System.out.println("-- E - Show order by name, year and IDE");
        langs = new TreeSet<Language>(new LanguageNameYearIdeComparator());
        langs.addAll(languages);
        for (Language lang : langs) {
            System.out.println(lang);
        }
    }

}

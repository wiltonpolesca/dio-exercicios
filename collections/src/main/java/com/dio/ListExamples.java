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
import com.dio.comparables.SerieNameGenreDurationComparator;
import com.dio.models.*;

public class ListExamples {

    static Scanner scanner = new Scanner(System.in);

    public static void listTest() {
        // Read only list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Readonly list: " + list);
        // throw an error
        // list.add(13);

        // Read/write only list
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Read/write list before add: " + list2);
        list2.add(13);
        System.out.println("Read/write list after add: " + list2);
    }

    public static void listSetTest() {
        System.out.println("--- Random order -----");
        Set<Serie> list = new HashSet<>();
        list.add(new Serie("GOT", "Fantasy", 68));
        list.add(new Serie("GOT", "Comedy", 68));
        list.add(new Serie("Dark", "Drama", 68));
        list.add(new Serie("That '70s Show", "Comedy", 37));

        for (Serie serie : list) {
            System.out.print(serie.getName() + "-");
            System.out.print(serie.getGenre() + "-");
            System.out.println(serie.getDuration());
        }

        System.out.println("--- Natural order -----");
        Set<Serie> list2 = new TreeSet<>(list);

        for (Serie serie : list2) {
            System.out.print(serie.getName() + "-");
            System.out.print(serie.getGenre() + "-");
            System.out.println(serie.getDuration());
        }

        System.out.println("--- Using comparator (Name, Genre, Duration) -----");
        Set<Serie> list3 = new TreeSet<>(new SerieNameGenreDurationComparator());
        list3.addAll(list);

        for (Serie serie : list3) {
            System.out.print(serie.getName() + "-");
            System.out.print(serie.getGenre() + "-");
            System.out.println(serie.getDuration());
        }
    }

    /**
     * 
     * 1 - Faça um programa que receba a temperatura média dos 6 primeiros meses do
     * ano e armazene-as em uma lista.
     * Após isso, calcule a média semestral das temperaturas e mostre todas as
     * temperaturas acime dessa média, e em que mês elas ocorreram (mostrar o mês
     * por extenso: 1 - janeiro, 2 - fevereiro...)
     */
    public static void exercice1() {

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);

        List<Double> avgWeather = new ArrayList<>();
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June");
        System.out.println(months);
        System.out.println("Please inform the AVG weather according to the month.");
        for (int i = 0; i < 6; i++) {
            avgWeather.add(getValueDouble("  " + months.get(i) + ": "));
        }

        Iterator<Double> iterator = avgWeather.iterator();
        Double value = 0.0;
        while (iterator.hasNext()) {
            value += iterator.next();
        }

        Double avg = value / 6;
        System.out.println("Months where the weather is higher than average (" + avg + ") ");
        for (int i = 0; i < avgWeather.size(); i++) {
            Double weather = avgWeather.get(i);
            if (weather > avg) {
                System.out.println("Month: " + months.get(i) + ": " + weather);
            }
        }
    }

    /**
     * 2 - Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
     * sobre um crime. As perguntas são:
     * 1 - Telefonou para a vítima?
     * 2 - Esteve no local do crime?
     * 3 - Mora perto da vítima?
     * 4 - Devia para a vítima?
     * 5 - Já trabalhou com a vítima?
     * 
     * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
     * como "suspeita", entre 3 e 4 "Cúmplice e 5 como assassina. Caso contrário,
     * ela será classificada como "Inocente".
     * 
     */
    public static void exercice2() {

        List<String> questions = Arrays.asList("1 - Did you call to the victim?", "2 - Were you at the crime place?",
                "3 - Do you live close to the victim?", "4 - Did you owe the victim?",
                "5 - Have you ever worked with the victim?");
        List<Integer> answers = new ArrayList<>();

        System.out.println("Please answer the questions");
        for (int i = 0; i < questions.size(); i++) {
            answers.add(getValueBoolean(questions.get(i)));
        }

        Iterator<Integer> iterator = answers.iterator();
        Integer result = 0;
        while (iterator.hasNext()) {
            result += iterator.next();
        }

        if (result < 2) {
            System.out.println("Innocent");
        } else if (result <= 2) {
            System.out.println("Suspect");
        } else if (result <= 4) {
            System.out.println("Sccomplice");
        } else if (result <= 5) {
            System.out.println("Killer");
        }
    }

    private static double getValueDouble(String caption) {
        try {

            System.out.print(caption);
            Double value = scanner.nextDouble();
            return value;

        } catch (Exception e) {

            System.out.println("Error to get the value, please informe a valid number");
            return getValueDouble(caption);
        }
    }

    private static Integer getValueBoolean(String caption) {
        System.out.print(caption);
        System.out.print(" (t/f) :");
        String value = scanner.nextLine();
        value = value.trim().toLowerCase();

        if (value.equals("t") || value.equals("f")) {
            return value.equals("f") ? 0 : 1;
        }
        System.out.println("Invalid answer, please informe a T/F");
        return getValueBoolean(caption);
    }
}

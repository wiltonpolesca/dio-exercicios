package com.dio.comparables;

import java.util.Comparator;

import com.dio.models.Language;

public class LanguageNameYearIdeComparator implements Comparator<Language>{

    @Override
    public int compare(Language s1, Language s2) {
        Integer name =  s1.getName().compareTo(s2.getName());
        if (name != 0) return name;
        Integer year =  s1.getYear().compareTo(s2.getYear());
        if (year != 0) return year;
        return s1.getIde().compareTo(s2.getIde());
    }
}
package com.dio.comparables;

import java.util.Comparator;

import com.dio.models.Language;

public class LanguageIdeComparator implements Comparator<Language>{

    @Override
    public int compare(Language s1, Language s2) {
        return  s1.getIde().compareTo(s2.getIde());
    }
}

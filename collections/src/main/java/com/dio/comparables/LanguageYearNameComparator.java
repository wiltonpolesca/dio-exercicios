package com.dio.comparables;

import java.util.Comparator;

import com.dio.models.Language;

public class LanguageYearNameComparator implements Comparator<Language>{

    @Override
    public int compare(Language s1, Language s2) {
        Integer Ide =  s1.getIde().compareTo(s2.getIde());
        if (Ide != 0) return Ide;
        return s1.getName().compareTo(s2.getName());
    }
}
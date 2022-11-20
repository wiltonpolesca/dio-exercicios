package com.dio.comparables;

import java.util.Comparator;

import com.dio.models.Serie;

public class SerieNameGenreDurationComparator implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int name = s1.getName().compareTo(s2.getName());
        if (name != 0) return name;
        
        int genre = s1.getGenre().compareTo(s2.getGenre());
        if (genre != 0) return genre;
        
        return Integer.compare(s1.getDuration(), s2.getDuration());
    }
    
}

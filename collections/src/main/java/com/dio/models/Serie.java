package com.dio.models;

public class Serie implements Comparable<Serie> {
    private String name;
    private String genre;
    private Integer duration;

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public Serie(String name, String genre, Integer duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "{ name: " + name + ", genre:" + genre + ", duration: " + duration + "}";

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((duration == null) ? 0 : duration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Serie other = (Serie) obj;
        return name.equals(other.name) &&
                genre.equals(other.genre) &&
                duration.equals(other.duration);
    }

    @Override
    public int compareTo(Serie serie) {
        int duration = Integer.compare(this.getDuration(), serie.getDuration());
        return duration != 0 ? duration : this.getGenre().compareTo(serie.getGenre());
    }
}

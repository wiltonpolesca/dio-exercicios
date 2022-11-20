package com.dio.models;

public class Language implements Comparable<Language> {
    private String name;
    private Integer year;
    private String ide;

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getIde() {
        return ide;
    }

    public Language(String name, Integer year, String ide) {
        this.name = name;
        this.year = year;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return getName() + ", " + getYear() + ", " + getIde();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Language other = (Language) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }

    @Override
    public int compareTo(Language lang) {
        return this.name.compareTo(lang.name);
    }
}

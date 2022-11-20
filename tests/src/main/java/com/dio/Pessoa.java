package com.dio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String name;
    LocalDate birthday;

    public Pessoa(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
    }

    public boolean isMaiorIdade() {
        return getIdade() >= 18;
    }
}

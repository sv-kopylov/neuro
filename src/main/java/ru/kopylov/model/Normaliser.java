package ru.kopylov.model;

/**
 * Created by se on 23.02.2018.
 */
public interface Normaliser <I,O>{
    O normalise(I input);
}

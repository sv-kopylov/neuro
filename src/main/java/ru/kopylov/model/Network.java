package ru.kopylov.model;

/**
 * Created by se on 23.02.2018.
 */
public interface Network {
    void dump();
    void setInputData(double[] data);
    double[] getResult();

}

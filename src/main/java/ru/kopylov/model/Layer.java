package ru.kopylov.model;

/**
 * Created by se on 15.02.2018.
 */
public interface Layer {
    int getNumber();
    void connect(Layer leftLayer);
    Neuron[] getNeurons();
}

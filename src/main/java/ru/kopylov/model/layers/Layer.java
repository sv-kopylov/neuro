package ru.kopylov.model.layers;

import ru.kopylov.model.elements.Neuron;

/**
 * Created by se on 15.02.2018.
 */
public interface Layer {
    int getNumber();
    void connect(Layer leftLayer);
    void think();
    Neuron[] getNeurons();
}

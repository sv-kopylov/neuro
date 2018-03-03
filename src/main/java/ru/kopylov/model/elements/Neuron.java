package ru.kopylov.model.elements;

/**
 * Created by se on 10.02.2018.
 */
public interface Neuron {
    double getSignal();
    void addInputSynapse(Synapse synapse);
    void think();


}

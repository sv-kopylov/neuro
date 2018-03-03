package ru.kopylov.model.elements;

import ru.kopylov.model.computation.Normaliser;

import java.util.ArrayList;

/**
 * Created by se on 11.02.2018.
 */
public class NeuronImpl implements Neuron {

    private double signal;
    private ArrayList<Synapse> inputSynapses;

    public NeuronImpl(Normaliser normaliser) {
        this.normaliser = normaliser;
    }

    public double getSignal() {
        return signal;
    }
    private final Normaliser normaliser;

    @Override
    public void addInputSynapse(Synapse synapse) {
        inputSynapses.add(synapse);
    }
    @Override
    public void think() {
        signal = normaliser.normalise(doSum());
    }

    private double doSum() {
        return   inputSynapses
                .stream()
                .mapToDouble(Synapse::getSignal)
                .parallel()
                .sum();
        }



}

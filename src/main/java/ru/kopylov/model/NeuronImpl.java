package ru.kopylov.model;

import java.util.ArrayList;

/**
 * Created by se on 11.02.2018.
 */
public class NeuronImpl implements Neuron {

    private double signal;
    private ArrayList<Synapse> inputSynapses;
//    private ArrayList<Synapse> output;
    public double getSignal() {
        return signal;
    }




    @Override
    public void treat() {
        signal = normalise(doSum());
    }

    private double doSum() {
        return   inputSynapses
                .stream()
                .mapToDouble(Synapse::getSignal)
                .parallel()
                .sum();
        }
    private double normalise(double sum){
        return sum;
    }

    @Override
    public void addInputSynapse(Synapse synapse) {
        inputSynapses.add(synapse);

    }

}

package ru.kopylov.model;

/**
 * Created by se on 10.02.2018.
 */
public class Synapse {
    private Neuron left;
    private Neuron right;
    private double weight;

    public double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getSignal(){
        return left.getSignal()*weight;
    }
}

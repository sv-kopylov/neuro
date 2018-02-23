package ru.kopylov.model;

/**
 * Created by se on 10.02.2018.
 */
public class Synapse {
    private Neuron source;
    private double weight;

    public double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void incrementWeightOn(double delta){
        weight+=delta;
    }
    public void decrementWeightOn(double delta){
        weight-=delta;
        if(weight<0){
            weight=0;
        }
    }
    public double getSignal(){
        return source.getSignal()*weight;
    }
    public void setSource(Neuron left) {
        this.source = left;
    }
}

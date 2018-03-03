package ru.kopylov.model.layers;

import ru.kopylov.model.computation.Normaliser;
import ru.kopylov.model.elements.Neuron;
import ru.kopylov.model.elements.NeuronImpl;
import ru.kopylov.model.elements.Synapse;

import java.util.stream.Stream;

/**
 * Created by se on 11.02.2018.
 */
public class LayerImpl implements Layer {
    private final int orderNumber;
    private final int numberOfNeurons;
    Neuron[] neurons;

    public LayerImpl(int orderNumber, int numberOfNeurons, Normaliser normaliser) {
        this.orderNumber = orderNumber;
        this.numberOfNeurons = numberOfNeurons;
        neurons = new Neuron[numberOfNeurons];
        for (int i = 0; i < numberOfNeurons; i++) {
            neurons[i] = new NeuronImpl(normaliser);
        }
    }

    @Override
    public void connect(Layer left) {
        Synapse synapse;
        for (int i = 0; i < left.getNeurons().length; i++) {
            synapse = new Synapse();
            synapse.setSource(left.getNeurons()[i]);
            for (int j = 0; j < neurons.length; j++) {
                neurons[j].addInputSynapse(synapse);
            }
        }
    }

    @Override
    public void think() {
        Stream.of(neurons).forEach(Neuron::think);
    }

    @Override
    public Neuron[] getNeurons() {
        return neurons;
    }

    @Override
    public int getNumber() {
        return orderNumber;
    }


}

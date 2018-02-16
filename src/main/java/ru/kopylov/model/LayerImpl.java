package ru.kopylov.model;

/**
 * Created by se on 11.02.2018.
 */
public class LayerImpl implements Layer {
    private final int orderNumber;
    private final int numberOfNeurons;
    Neuron[] neurons;
    public LayerImpl(int orderNumber, int numberOfNeurons) {
        this.orderNumber = orderNumber;
        this.numberOfNeurons = numberOfNeurons;
        neurons = new Neuron[numberOfNeurons];
        for(int i=0; i<numberOfNeurons; i++){
            neurons[i] = new NeuronImpl();
        }
    }
    @Override
    public void connect(Layer left){
        if(!(left instanceof LayerImpl)){
            throw new IllegalArgumentException();
        }
        LayerImpl leftLayuer = (LayerImpl) left;
        for(int i=0; i<numberOfNeurons; i++){
            for(int j=0; j<leftLayuer.numberOfNeurons; j++){
                
            }

        }
    }

    @Override
    public int getNumber() {
        return orderNumber;
    }


}

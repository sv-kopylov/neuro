package ru.kopylov.model.network;

import ru.kopylov.model.computation.Normaliser;
import ru.kopylov.model.layers.Layer;
import ru.kopylov.model.network.Network;

/**
 * Created by se on 23.02.2018.
 */
public class NetworkImpl implements Network {

    private Layer[] layers;
    private Normaliser normaliser;

    public NetworkImpl(Layer[] layers, Normaliser normaliser) {
        this.layers = layers;
        this.normaliser = normaliser;
    }

    @Override
    public void dump() {

    }

    @Override
    public void setInputData(double[] data) {

    }

    @Override
    public double[] getResult() {
        return new double[0];
    }
}

package ru.kopylov.model.network;

import ru.kopylov.model.computation.Normaliser;
import ru.kopylov.model.layers.Layer;

import java.util.HashMap;

/**
 * Created by se on 27.02.2018.
 */
public class NetworkFabric {
    private Network network;
    private Layer[] layers;
    private Normaliser normaliser;
    private int[] layerConf;

    public NetworkFabric setLayerConfiguration(int...ints){
        layerConf = ints;
        return this;
    }
    public NetworkFabric setNormaliser(Normaliser normaliser){
        this.normaliser=normaliser;
        return this;
    }

    public Network build(){
        if(layerConf==null||layerConf.length<1||normaliser==null){
            throw new IllegalStateException("Layer conf or Normaliser not defined");
        }
    }
}

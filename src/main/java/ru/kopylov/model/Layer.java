package ru.kopylov.model;

/**
 * Created by se on 15.02.2018.
 */
public interface Layer {
    public int getNumber();
    public void connect(Layer leftLayer);
}

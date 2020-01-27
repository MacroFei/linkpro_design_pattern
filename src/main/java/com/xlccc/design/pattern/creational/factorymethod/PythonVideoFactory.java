package com.xlccc.design.pattern.creational.factorymethod;

public class PythonVideoFactory extends  VideoFactory {
    public Video getVideo() {
        return new PythonVideo();
    }
}

package com.oliiarchyk.designpatterns.prototype;

public class Config {

//    @Bean
//    @Scope("prototype")
    public PrototypeObject prototypeObjectTrue() {
        return new PrototypeObject();
    }

//    @Bean
    public PrototypeObject prototypeObjectFalse() {
        return new PrototypeObject();
    }
}

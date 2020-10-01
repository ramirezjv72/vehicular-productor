package mx.gob.nayarit.productor.controller;

import mx.gob.nayarit.productor.model.Vehicular;
import mx.gob.nayarit.productor.producer.VehicularProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")

public class VehicularController {
    @Autowired
    private VehicularProducer vehicularProductor;

    @PostMapping("/publish")
    public String enviar(@RequestBody  Vehicular vehicular){
        vehicularProductor.send(vehicular);
        return "SUCESS";
    }

}
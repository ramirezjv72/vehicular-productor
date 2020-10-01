package mx.gob.nayarit.productor.serializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.gob.nayarit.productor.model.Vehicular;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class VehicularSerializer implements Serializer<Vehicular> {


    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String s, Vehicular vehicular) {
        return new byte[0];
    }

    @Override
    public byte[] serialize(String topic, Headers headers, Vehicular data) {
        ObjectMapper mapper = new ObjectMapper();


        try {
            return mapper.writeValueAsBytes(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new byte[0];

    }

    @Override
    public void close() {

    }
}
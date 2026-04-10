package Prototype.ComRegistro;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    
    private Map<String, Prototype> registry = new HashMap<>();

    public void addRegistry(String key, Prototype prototype){
        registry.put(key, prototype);
    }

    public Prototype get(String key){
        Prototype prototype = registry.get(key);

        return prototype != null ? prototype.clone() : null;

    }
}

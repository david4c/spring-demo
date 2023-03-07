package com.epam.leaarn.demo.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {
    @ReadOperation
    public Map<String, String> custom() {
        final Map<String, String> map = new HashMap<>();
        map.put("cpu", "127 c");
        map.put("status", "ALERT !!!");
        return map;
    }
}

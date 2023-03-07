package com.epam.leaarn.demo.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DataWebServiceApiHealthIndicator implements HealthIndicator {

    private static final String MESSAGE_KEY = "Data Web service API";

    @Override
    public Health health() {
        if (!isServiceUp()) {
            return Health.down().withDetail(MESSAGE_KEY, "Down").build();
        }
        return Health.up().withDetail(MESSAGE_KEY, "UP").build();

    }

    private boolean isServiceUp() {
        return true;
    }
}

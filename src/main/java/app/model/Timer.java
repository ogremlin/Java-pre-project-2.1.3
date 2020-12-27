package app.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}

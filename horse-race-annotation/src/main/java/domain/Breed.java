package domain;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Component
public class Breed {
    private String name;
    private Integer maxSpeed;

    @Override
    public String toString() {
        return name;
    }
}

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
public class Horse {
    private String name;
    private Integer age;
    private Breed breed;

    @Override
    public String toString() {
        return name +
                ", " + age + " age" +
                ", " + breed;
    }
}

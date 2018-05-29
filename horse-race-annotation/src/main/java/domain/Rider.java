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
public class Rider {
    private String name;
    private Integer age;
    private Horse horse;

    @Override
    public String toString() {
        return name + ", " + age + " years old," + " Horse{" + horse + "}";
    }
}

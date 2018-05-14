package domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Breed {
    private String name;
    private Integer maxSpeed;

    @Override
    public String toString() {
        return name;
    }
}

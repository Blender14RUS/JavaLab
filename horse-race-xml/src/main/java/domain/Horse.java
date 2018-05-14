package domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
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

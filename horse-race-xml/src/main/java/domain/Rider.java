package domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Rider {
    private String name;
    private Integer age;
    private Horse horse;

    @Override
    public String toString() {
        return name + ", " + age + " years old," + " Horse{" + horse + "}";
    }
}

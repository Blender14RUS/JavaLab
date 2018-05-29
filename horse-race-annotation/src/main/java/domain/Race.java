package domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Component
public class Race {
    private LocalTime date;
    private List<Rider> ridersList;
}

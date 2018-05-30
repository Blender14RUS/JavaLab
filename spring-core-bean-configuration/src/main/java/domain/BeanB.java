package domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BeanB {
    BeanA beanField;
    String somethingElse;
}

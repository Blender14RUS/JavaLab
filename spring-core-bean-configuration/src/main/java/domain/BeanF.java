package domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BeanF {
    String name;

    void init(){
        System.out.println("BeanF - init");
    }

    void destroy(){
        System.out.println("BeanF - destroy");
    }
}

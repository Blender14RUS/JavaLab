package domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BeanE {
    String name;

    public void printName(){
        System.out.println("My name: "+ name  + "\n");
    }
}

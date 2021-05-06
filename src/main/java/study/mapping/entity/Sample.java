package study.mapping.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Sample {
    private String name;
    private int age;
    private STATUS status;

    @Override
    public String toString() {
        return "Sample{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", status=" + status +
            '}';
    }
}

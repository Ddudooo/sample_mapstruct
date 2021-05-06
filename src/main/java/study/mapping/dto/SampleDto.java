package study.mapping.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SampleDto {
    private String fullName;
    private String status;
    private Integer age;

    @Override
    public String toString() {
        return "SampleDto{" +
            "fullName='" + fullName + '\'' +
            ", status='" + status + '\'' +
            ", age=" + age +
            '}';
    }
}

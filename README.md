# Mapstruct 예제 

객체와 객체간 변환 및 처리 과정 처리시 사용하는 라이브러리

## 사용법

`Gradle` 설정

```groovy
dependencies {
    implementation 'org.mapstruct:mapstruct:1.4.2.Final'
    implementation 'org.projectlombok:lombok:1.18.20'
    implementation 'org.projectlombok:lombok-mapstruct-binding:0.2.0'

    annotationProcessor 'org.projectlombok:lombok-mapstruct-binding:0.2.0'
    annotationProcessor 'org.mapstruct:mapstruct-processor:1.4.2.Final'
    annotationProcessor 'org.projectlombok:lombok:1.18.20'

    testAnnotationProcessor 'org.projectlombok:lombok-mapstruct-binding:0.2.0'
    testAnnotationProcessor 'org.mapstruct:mapstruct-processor:1.4.2.Final'
    testAnnotationProcessor 'org.projectlombok:lombok:1.18.20'
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
}
```

롬복 어노테이션 프로세스를 사용시 디펜던시 작성 순서에 따라 다르게 동작하므로 
`lombok-mapstruct-binding` 을 통해 해결

#### 소스 사용 예
[소스](src/main/java/study/mapping/mapper/SampleMapper.java)

```java
@Mapper
public interface Mapper {

    Mapper INSTANCE = Mappers.getMapper( Mapper.class ); 
 
    @Mapping(source = "field", target = "dtofield")
    DTO entityToDto(Entity entity); 
}
```

스프링 빈으로 등록시
```java
@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper{
    //...
}
```

자세한 사용 예시는 공식 문서 참조...

### 참고

* [공홈](https://mapstruct.org/)
* [Object Mapping 어디까지 해봤니?](https://meetup.toast.com/posts/213)
* [Quick Guide to MapStruct](https://www.baeldung.com/mapstruct)
* [[Spring] MapStruct 와 Lombok](https://wise-develop.tistory.com/18)

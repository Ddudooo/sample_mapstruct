package study.mapping.mapper;

import org.junit.jupiter.api.Test;
import study.mapping.dto.SampleDto;
import study.mapping.entity.STATUS;
import study.mapping.entity.Sample;

import static org.junit.jupiter.api.Assertions.*;

class SampleMapperTest {

    @Test
    void mappingTest(){
        Sample newSample = new Sample("sample", 10, STATUS.NORMAL);
        SampleDto sampleDto = SampleMapper.INSTANCE.sampleToDto(newSample);

        System.out.println(newSample);
        System.out.println(sampleDto);
        assertEquals(newSample.getName(), sampleDto.getFullName());
        assertEquals(newSample.getAge(), sampleDto.getAge());
        assertEquals(newSample.getStatus().name(), sampleDto.getStatus());
    }
}
package study.mapping.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import study.mapping.dto.SampleDto;
import study.mapping.entity.Sample;

@Mapper
public interface SampleMapper {

    SampleMapper INSTANCE = Mappers.getMapper(SampleMapper.class);
    @Mapping(source = "name", target = "fullName")
    SampleDto sampleToDto(Sample entity);
}

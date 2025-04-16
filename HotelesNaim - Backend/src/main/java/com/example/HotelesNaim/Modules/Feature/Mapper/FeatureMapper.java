package com.example.HotelesNaim.Modules.Feature.Mapper;

import com.example.HotelesNaim.Modules.Feature.DTO.FeatureDTO;
import com.example.HotelesNaim.Modules.Feature.Feature;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FeatureMapper {
    FeatureMapper INSTANCE = Mappers.getMapper(FeatureMapper.class);

    FeatureDTO entityToDto(Feature feature);

    Feature dtoToEntity(FeatureDTO featureDTO);
}

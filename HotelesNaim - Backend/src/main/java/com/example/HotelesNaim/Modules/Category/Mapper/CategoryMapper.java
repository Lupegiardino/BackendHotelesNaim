package com.example.HotelesNaim.Modules.Category.Mapper;

import com.example.HotelesNaim.Modules.Category.Category;
import com.example.HotelesNaim.Modules.Category.DTO.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO entityToDto(Category category);

    Category dtoToEntity(CategoryDTO categoryDTO);
}

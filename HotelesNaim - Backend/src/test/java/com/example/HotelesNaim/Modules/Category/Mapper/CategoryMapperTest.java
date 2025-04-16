package com.example.HotelesNaim.Modules.Category.Mapper;
import com.example.HotelesNaim.Modules.Category.Category;
import com.example.HotelesNaim.Modules.Category.DTO.CategoryDTO;
import com.example.HotelesNaim.Modules.Category.Mapper.CategoryMapper;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {

    @Test
    void entityToDto() {
        Category category = Category.builder()
                .id(UUID.randomUUID())
                .name("Hoteles")
                .description("Los mejores hoteles.")
                .image("hoteles.jpg")
                .build();
        CategoryDTO categoryDTO = CategoryMapper.INSTANCE.entityToDto(category);
        assertEquals(category.getId(), categoryDTO.getId());
        assertEquals(category.getName(), categoryDTO.getName());
        assertEquals(category.getDescription(), categoryDTO.getDescription());
        assertEquals(category.getImage(), categoryDTO.getImage());
    }

    @Test
    void dtoToEntity() {
        CategoryDTO categoryDTO = CategoryDTO.builder()
                .id(UUID.randomUUID())
                .name("Hoteles")
                .description("Los mejores hoteles.")
                .image("hoteles.jpg")
                .build();
        Category category = CategoryMapper.INSTANCE.dtoToEntity(categoryDTO);
        assertEquals(categoryDTO.getId(), category.getId());
        assertEquals(categoryDTO.getName(), category.getName());
        assertEquals(categoryDTO.getDescription(), category.getDescription());
        assertEquals(categoryDTO.getImage(), category.getImage());
    }
}
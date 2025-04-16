package com.example.HotelesNaim.Modules.StayMapper;
import com.example.HotelesNaim.Modules.Category.Category;
import com.example.HotelesNaim.Modules.Feature.DTO.FeatureDTO;
import com.example.HotelesNaim.Modules.Feature.Feature;
import com.example.HotelesNaim.Modules.Stay.DTO.StayDTO;
import com.example.HotelesNaim.Modules.Stay.Mapper.StayMapper;
import com.example.HotelesNaim.Modules.Stay.Stay;
import com.example.HotelesNaim.Modules.Stay.StayImage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StayMapperTest {

    Category category;
    Set<StayImage> images;
    Stay stay;
    StayDTO stayDTO;

    Set<Feature> features;

    @BeforeEach
    void tearDown() {
        category = Category.builder()
                .id(UUID.randomUUID())
                .name("Hoteles")
                .description("Los mejores hoteles.")
                .image("hoteles.jpg")
                .build();
        images = Set.of(
                StayImage.builder()
                        .id(UUID.randomUUID())
                        .url("imagen1.jpg")
                        .build(),
                StayImage.builder()
                        .id(UUID.randomUUID())
                        .url("imagen2.jpg")
                        .build());
        features = Set.of(
                Feature.builder()
                        .id(UUID.randomUUID())
                        .name("icon1")
                        .icon("icon1.jpg")
                        .build(),
                Feature.builder()
                        .id(UUID.randomUUID())
                        .name("icon2")
                        .icon("icon2.jpg")
                        .build());
        stay = Stay.builder()
                .id(UUID.randomUUID())
                .name("Hotel en la playa")
                .description("Hotel en la playa y céntrico")
                .price(100.0)
                .category(category)
                .images(images)
                .features(features)
                .build();
        stayDTO = StayDTO.builder()
                .id(UUID.randomUUID())
                .name("Hotel en la playa")
                .description("Hotel en la playa y céntrico")
                .price(100.0)
                .category_id(category.getId())
                .images(Set.of("imagen1.jpg", "imagen2.jpg"))
                .features(Set.of(
                        FeatureDTO.builder()
                                .id(UUID.randomUUID())
                                .name("icon1")
                                .icon("icon1.jpg")
                                .build(),
                        FeatureDTO.builder()
                                .id(UUID.randomUUID())
                                .name("icon2")
                                .icon("icon2.jpg")
                                .build()))
                .build();
        category.setStays(Set.of(stay));
    }

    @Test
    void entityToDto() {
        StayDTO stayDTO = StayMapper.INSTANCE.entityToDto(stay);
        assertEquals(stay.getId(), stayDTO.getId());
        assertEquals(stay.getName(), stayDTO.getName());
        assertEquals(stay.getDescription(), stayDTO.getDescription());
        assertEquals(stay.getPrice(), stayDTO.getPrice());
        assertEquals(stay.getAddress(), stayDTO.getAddress());
        assertEquals(stay.getCategory().getId(), stayDTO.getCategory_id());
        assertEquals(stay.getImages().size(), stayDTO.getImages().size());
        assertEquals(stay.getFeatures().size(), stayDTO.getFeatures().size());
        System.out.println(stayDTO);
    }

    @Test
    void dtoToEntity() {
        Stay stay = StayMapper.INSTANCE.dtoToEntity(stayDTO);
        assertEquals(stayDTO.getId(), stay.getId());
        assertEquals(stayDTO.getName(), stay.getName());
        assertEquals(stayDTO.getDescription(), stay.getDescription());
        assertEquals(stayDTO.getPrice(), stay.getPrice());
        assertEquals(stayDTO.getAddress(), stay.getAddress());
        assertEquals(stayDTO.getCategory_id(), stay.getCategory().getId());
        assertEquals(stayDTO.getImages().size(), stay.getImages().size());
        assertEquals(stayDTO.getFeatures().size(), stay.getFeatures().size());
        System.out.println(stay);
    }
}

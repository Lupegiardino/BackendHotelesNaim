package com.example.HotelesNaim.Modules.Review.DTO;

import com.example.HotelesNaim.Modules.User.DTO.UserSummaryDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewSummaryDTO {
    private UUID id;
    private Integer qualification;
    private String comment;
    private LocalDateTime createdAt;
    private UserSummaryDTO user;
}

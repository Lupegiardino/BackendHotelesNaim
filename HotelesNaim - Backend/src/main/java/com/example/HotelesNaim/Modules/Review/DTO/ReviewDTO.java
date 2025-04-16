package com.example.HotelesNaim.Modules.Review.DTO;

import com.example.HotelesNaim.Modules.Stay.DTO.StayDTO;
import com.example.HotelesNaim.Modules.User.DTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private Integer qualification;
    private String comment;
    private LocalDate createdAt;
    private UserDTO user;
    private StayDTO stay;
}

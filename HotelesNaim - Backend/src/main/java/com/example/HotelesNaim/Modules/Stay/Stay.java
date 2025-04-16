package com.example.HotelesNaim.Modules.Stay;

import com.example.HotelesNaim.Modules.Address.Address;
import com.example.HotelesNaim.Modules.Category.Category;
import com.example.HotelesNaim.Modules.Feature.Feature;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "stays")
public class Stay {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @NotNull(message = "Name cannot be null")
    private String name;

    private String description;

    @NotNull(message = "Images cannot be null")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StayImage> images;

    //    @NotNull(message = "Features cannot be null")
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.DETACH})
    @JoinTable(
            name = "stay_feature",
            joinColumns = @JoinColumn(name = "stay_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private Set<Feature> features;

    @NotNull(message = "Price cannot be null")
    @PositiveOrZero(message = "Price must be zero or positive")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_category", foreignKey = @ForeignKey(name = "FK_id_category"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;

    @NotNull(message = "Address cannot be null")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(columnDefinition = "DOUBLE DEFAULT 0.0")
    @PositiveOrZero(message = "Appreciation must be zero or positive")
    private Double appreciation = 0.0;

    @NotNull(message = "Policies cannot be null")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StayPolicy> policies;
}

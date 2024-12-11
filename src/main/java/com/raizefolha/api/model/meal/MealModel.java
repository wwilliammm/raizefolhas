package com.raizefolha.api.model.meal;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pratos")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class MealModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String description;

    public MealModel (String name, Double price, String description) {

        this.name = name;
        this.price = price;
        this.description = description;

    }

    // public void updateMeal (UpdateMealData data) {

    //     if (data.price() != null){
    //         this.price = data.price();
    //     }

    //     if (data.description() != null) {
    //         this.description = data.description();
    //     }

    // }

}

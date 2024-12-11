package com.raizefolha.api.model.user;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuarios")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String telephone;

    public UserModel (String name, String email, String password, String telephone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }    
    
    // public void updateUser(UpdateUserData data){

    //     if (data.email() != null){
    //         this.email = data.email();
    //     }

    //     if (data.password() != null) {
    //         this.password = data.password();
    //     }

    //     if (data.telephone() != null){
    //         this.telephone = data.telephone();
    //     }

    // }

}

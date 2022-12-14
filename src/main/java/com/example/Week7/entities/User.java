package com.example.Week7.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="users")
@Entity()
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    private String phone;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 50)
    private String uuid;

    public User(String name, String email, String phone) {
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

}

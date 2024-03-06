package ru.sberbank.jd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    private String id;
    private String login;
    private String password;
}

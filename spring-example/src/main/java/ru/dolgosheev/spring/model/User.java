package ru.dolgosheev.spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class User {

    private String id;
    private String name;
    private String body;
}

package br.com.luciano.mapper.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

}

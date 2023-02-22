package br.com.luciano.mapper.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonDto {
    
    private Long key;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}

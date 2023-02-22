/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.luciano.mapper.util;

import br.com.luciano.mapper.dto.PersonDto;
import br.com.luciano.mapper.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

/**
 *
 * @author luciano
 */
public class Mapper {
    
    
    private static final ModelMapper mapper = new ModelMapper();
    
    public static <O, D> D parseObject(O origen, Class<D> destination){
        
        TypeMap<Person, PersonDto> property = mapper.createTypeMap(Person.class, PersonDto.class);
        property.addMapping(Person::getId, PersonDto::setKey);
        return mapper.map(origen, destination);
    }
    
    public static <O, D> List<D> parseListObjects(List<O> origins, Class<D> destination){
        
        TypeMap<Person, PersonDto> property = mapper.createTypeMap(Person.class, PersonDto.class);
        property.addMapping(Person::getId, PersonDto::setKey);
        
        List<D> destinationObjects = new ArrayList<>();
        
        for (O o : origins) {
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }
    
}

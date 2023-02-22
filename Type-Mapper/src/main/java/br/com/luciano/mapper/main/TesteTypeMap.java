package br.com.luciano.mapper.main;

import br.com.luciano.mapper.util.Mapper;
import br.com.luciano.mapper.dto.PersonDto;
import br.com.luciano.mapper.entity.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class TesteTypeMap {
    
    //private static final ModelMapper mapper = new ModelMapper();

    public static void main(String[] args) {
        
        /*
        TypeMap<Person, PersonDto> property = mapper.createTypeMap(Person.class, PersonDto.class);
        property.addMapping(Person::getId, PersonDto::setKey);
        
        Person person = Person.builder()
        		.id(5L)
        		.firstName("luciano")
        		.lastName("Oliveira")
        		.address("Belo horizonte")
        		.gender("male")
        		.build();
        
        PersonDto personDto = mapper.map(person, PersonDto.class);
        System.out.println(personDto);	
        */
        
        /*
        Person person = Person.builder()
        		.id(5L)
        		.firstName("luciano")
        		.lastName("Oliveira")
        		.address("Belo horizonte")
        		.gender("male")
        		.build();
        
        PersonDto personDto = Mapper.parseObject(person, PersonDto.class);
        System.out.println(personDto);

        */
        
        
        Person person1 = Person.builder()
        		.id(1L)
        		.firstName("luciano")
        		.lastName("Oliveira")
        		.address("Belo horizonte")
        		.gender("male")
        		.build();
        
        Person person2 = Person.builder()
        		.id(2L)
        		.firstName("Karine")
        		.lastName("Ferreira")
        		.address("Belo horizonte")
        		.gender("female")
        		.build();
        
        Person person3 = Person.builder()
        		.id(3L)
        		.firstName("Pedro")
        		.lastName("Silvestre")
        		.address("Belo horizonte")
        		.gender("male")
        		.build();
        
        List<Person> persons = Arrays.asList(person1, person2, person3);
        
        List<PersonDto> personDtos = Mapper.parseListObjects(persons, PersonDto.class);
        
        persons.forEach(System.out::println);

    }
    
}

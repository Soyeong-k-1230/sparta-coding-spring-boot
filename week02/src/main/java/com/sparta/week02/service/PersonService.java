package com.sparta.week02.service;

import com.sparta.week02.domain.Person;
import com.sparta.week02.domain.PersonRepository;
import com.sparta.week02.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Not Exited")
        );

        person.update(requestDto);
        return person.getId();
    }
}

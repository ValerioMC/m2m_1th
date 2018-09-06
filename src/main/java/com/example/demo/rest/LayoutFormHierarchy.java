package com.example.demo.rest;


import com.example.demo.model.FormStructure;
import com.example.demo.repository.FormStructureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@RestController
public class LayoutFormHierarchy {

    private final FormStructureRepository formStructureRepository;

    @GetMapping("/form/{id}")
    public ResponseEntity<FormStructure> getFormLayout(@PathVariable Long id) {
        Optional<FormStructure> byId = formStructureRepository.findById(id);

        log.debug(byId.toString());

        return new ResponseEntity<>(
                byId.get(),
                HttpStatus.OK
        );
    }
}

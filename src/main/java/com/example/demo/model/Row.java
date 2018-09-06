package com.example.demo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@DiscriminatorValue("ROW")
public class Row extends LayoutElement {

    @ManyToOne
    @JoinColumn(name = "ID_FORM_STRUCTURE")
    private FormStructure formStructure;

}

package io.jfrflabs.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    // TODO: Modify Class in order to seperate firstname and lastname from the original name variable.

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}

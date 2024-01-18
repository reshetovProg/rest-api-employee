package com.springproject.restapiemployee.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    long id;
    String name;
    String surname;
    String email;
    String dob;
}

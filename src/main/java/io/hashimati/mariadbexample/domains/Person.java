package io.hashimati.mariadbexample.domains;

import javax.persistence.*;
import javax.persistence.*;
import lombok.*;
import javax.validation.constraints.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity(name = "people")
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @EqualsAndHashCode.Exclude
  private long id;

  private String Name;

  private int age;
}
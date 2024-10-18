package com.matcha.backend.entity;

import com.matcha.backend.entity.enums.InterestEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.UUID;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID userId;

  @NotBlank(message = "Name cannot be blank")
  private String firstName;

  @NotBlank(message = "Name cannot be blank")
  private String lastName;

  @Email(message = "Email should be valid")
  @NotBlank(message = "Email is mandatory")
  private String email;

  @NotBlank(message = "Password cannot be blank")
  private String passwordHash;

  @NotBlank
  private String gender;

  private String bio;

  @ElementCollection(targetClass = InterestEnum.class)
  @Enumerated(EnumType.STRING)
  @CollectionTable(name = "user_interests", joinColumns = @JoinColumn(name = "user_id"))
  @Column(name = "interest")
  private List<InterestEnum> interests;

  private String lastLocation;

  @OneToMany(mappedBy = "userId")
  private List<UserEntity> blockedUsers;

  @OneToMany(mappedBy = "userId")
  private List<UserEntity> viewedProfiles;
}

package com.matcha.backend.entity;

import com.matcha.backend.converter.InterestEnumJsonConverter;
import com.matcha.backend.converter.PictureLinkConverter;
import com.matcha.backend.entity.enums.InterestEnum;
import com.matcha.backend.entity.enums.SexualOrientationEnum;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  private Date dateOfBirth;

  private String bio;

  private SexualOrientationEnum sexualOrientation;

  private Float fameRating;

  private Date lastOnline;

  private Boolean isOnline;


  @Convert(converter = PictureLinkConverter.class)
  private List<String> pictureLinks;

  @Lob
  @Convert(converter = InterestEnumJsonConverter.class)
  private List<InterestEnum> interests;

  private String lastLocation;

  @OneToMany
  @JoinColumn(name = "liked_user_id")
  private List<UserEntity> likedUsers;

  @OneToMany
  @JoinColumn(name = "received_like_id")
  private List<UserEntity> receivedLikes;

  @OneToMany
  @JoinColumn(name = "matched_user_id")
  private List<UserEntity> matchedUsers;

  @OneToMany
  @JoinColumn(name = "blocked_user_id")
  private List<UserEntity> blockedUsers;

  @OneToMany
  @JoinColumn(name = "viewed_profile_id")
  private List<UserEntity> viewedProfiles;

  @OneToMany
  @JoinColumn(name = "viewed_by_id")
  private List<UserEntity> viewedBy;
}

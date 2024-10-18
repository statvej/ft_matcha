package com.matcha.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID messageId;

  @ManyToOne
  @JoinColumn(name = "sender_id", nullable = false)
  private UserEntity sender;

  @NotBlank(message = "Message content cannot be empty")
  private String content;

  @CreationTimestamp
  private LocalDateTime timestamp;

  private String reaction;
}

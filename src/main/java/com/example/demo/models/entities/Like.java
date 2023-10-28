package com.example.demo.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Like_Table")
public class Like {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long likeId;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post postEntity;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userEntity;

    @Transient
    @ManyToOne (fetch = FetchType.LAZY)
    private Admin AdminEntity;
}

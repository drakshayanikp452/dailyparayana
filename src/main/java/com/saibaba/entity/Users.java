package com.saibaba.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="USERS")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "user_id", nullable = false)
    private Long id;

    @Column (name = "user_name", nullable = false)
    private String name;

    @Column (name = "role_id", nullable = false)
    private Long roleId;

    @Column (name = "created_date", nullable = false)
    private Date createdDate;

    @Column (name = "last_updated_date", nullable = false)
    private  Date last_updated_date;

    @Column (name = "created_user", nullable = false)
    private String createdUser;

    @Column (name = "last_updated_user", nullable = false)
    private String lastUpdatedUser;


}

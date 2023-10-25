package com.saibaba.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "GROUPS")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id", nullable = false)
    private Long id;

    @Column(name = "group_name", nullable = false)
    private String name;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "last_updated_date", nullable = false)
    private Date lastUpdatedDate;

    @Column(name = "created_user", nullable = false)
    private String createdUser;

    @Column(name = "last_updated_user", nullable = false)
    private String lastUpdatedUser;

}


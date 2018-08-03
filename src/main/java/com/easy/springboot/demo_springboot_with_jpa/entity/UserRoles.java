package com.easy.springboot.demo_springboot_with_jpa.entity;

import javax.persistence.*;


@Entity
@Table(name = "user_roles")
public class UserRoles {

    @Column(name = "user_id")
    private long userId;
    @Column(name = "roles_id")
    private long rolesId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public long getRolesId() {
        return rolesId;
    }

    public void setRolesId(long rolesId) {
        this.rolesId = rolesId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}

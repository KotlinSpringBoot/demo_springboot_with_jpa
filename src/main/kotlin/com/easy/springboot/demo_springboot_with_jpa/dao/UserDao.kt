package com.easy.springboot.demo_springboot_with_jpa.dao

import com.easy.springboot.demo_springboot_with_jpa.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserDao : JpaRepository<User, Long>

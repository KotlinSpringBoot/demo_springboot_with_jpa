package com.easy.springboot.demo_springboot_with_jpa.controller

import com.easy.springboot.demo_springboot_with_jpa.dao.UserDao
import com.easy.springboot.demo_springboot_with_jpa.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {
    @Autowired lateinit var userDao: UserDao

    @GetMapping("/findAll")
    fun findAll(): List<User> {
        return userDao.findAll()
    }
}

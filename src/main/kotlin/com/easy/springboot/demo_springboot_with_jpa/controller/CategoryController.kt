package com.easy.springboot.demo_springboot_with_jpa.controller

import com.easy.springboot.demo_springboot_with_jpa.dao.CategoryDao
import com.easy.springboot.demo_springboot_with_jpa.entity.Category
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/category")
class CategoryController {
    @Autowired lateinit var categoryDao: CategoryDao

    @GetMapping("/page")
    fun findAll(
            @RequestParam(value = "pageNo", defaultValue = "0") pageNo: Int,
            @RequestParam(value = "pageSize", defaultValue = "10") pageSize: Int
    ): Page<Category> {
        return categoryDao.findAll(PageRequest.of(pageNo, pageSize))
    }

    @GetMapping("/search")
    fun search(
            @RequestParam(value = "searchText", defaultValue = "") searchText: String,
            @RequestParam(value = "pageNo", defaultValue = "0") pageNo: Int,
            @RequestParam(value = "pageSize", defaultValue = "10") pageSize: Int
    ): Page<Category> {
        return categoryDao.search(searchText, PageRequest.of(pageNo, pageSize))
    }
}

package com.easy.springboot.demo_springboot_with_jpa.dao

import com.easy.springboot.demo_springboot_with_jpa.entity.Category
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CategoryDao : JpaRepository<Category, Long> {
    @Query("select c from #{#entityName} c where c.name like %:searchText%")
    fun search(searchText: String, pageable: Pageable): Page<Category>
}

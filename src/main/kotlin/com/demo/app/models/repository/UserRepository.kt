package com.demo.app.models.repository

import com.demo.app.models.entity.User
import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository

@Repository
interface UserRepository : CrudRepository<User, Long> {
}
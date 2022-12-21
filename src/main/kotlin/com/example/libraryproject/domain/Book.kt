package com.example.libraryproject.domain

import com.example.libraryproject.domain.base.BaseEntity
import javax.persistence.*

@Entity
@Table
class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    @Column
    val title : String,

) : BaseEntity () {
}
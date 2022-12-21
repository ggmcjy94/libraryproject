package com.example.libraryproject.controller

import com.example.libraryproject.model.BookRequest
import com.example.libraryproject.service.BookService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/books")
class BookController (
    private val bookService: BookService,
) {

    @PostMapping
    fun bookRegister (@RequestBody request : BookRequest) =
        ResponseEntity(bookService.createBook(request), HttpStatus.CREATED)
}
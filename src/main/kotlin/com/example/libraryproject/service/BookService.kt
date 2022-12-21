package com.example.libraryproject.service

import com.example.libraryproject.domain.Book
import com.example.libraryproject.domain.BookRepository
import com.example.libraryproject.model.BookRequest
import com.example.libraryproject.model.BookResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class BookService (
    private val bookRepository: BookRepository
) {

    @Transactional
    fun createBook(request: BookRequest): BookResponse {
        val book = Book(
            title = request.title
        )
        return BookResponse(bookRepository.save(book))
    }
}
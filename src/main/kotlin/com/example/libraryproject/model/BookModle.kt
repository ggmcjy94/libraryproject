package com.example.libraryproject.model

import com.example.libraryproject.domain.Book
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class BookRequest (
    val title : String
) {

}


data class BookResponse(
    val id : Long,
    val title: String,

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: LocalDateTime?,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val updatedAt: LocalDateTime?,

) {

    companion object {
        operator fun invoke(book: Book) =
            with(book) {
                BookResponse(
                    id = id!!,
                    title = title,
                    createdAt = createdAt,
                    updatedAt = updatedAt,
                )
            }
    }

}
package com.example.libraryproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class LibraryprojectApplication

fun main(args: Array<String>) {
	runApplication<LibraryprojectApplication>(*args)
}

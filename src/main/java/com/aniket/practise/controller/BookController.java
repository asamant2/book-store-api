package com.aniket.practise.controller;

import com.aniket.practise.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto bookDto = BookDto.builder().title("Sherlock Holmes").build();
        return ResponseEntity.ok(Arrays.asList(bookDto));
    }
}

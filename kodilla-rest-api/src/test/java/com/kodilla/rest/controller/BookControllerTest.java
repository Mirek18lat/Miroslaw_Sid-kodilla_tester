package com.kodilla.rest.controller;

import com.kodilla.rest.controller.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }
    @Test
    void shouldAddBooks() {
        //given
        BookService bookService = new BookService();

        BookController bookControllerMock = new BookController(bookService);

        //when
        bookService.addBook(new BookDto("Title 1", "Author 1"));
        bookService.addBook(new BookDto("Title 2", "Author 2"));
        List<BookDto> result = bookControllerMock.getBooks();


        //then
        assertThat(result).hasSize(2);
    }
}
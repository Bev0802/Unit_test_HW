package org.example.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    private BookService bookService;

    // Создаем мок-объект BookRepository с помощью аннотации @Mock
    @Mock
    private BookRepository bookRepository;

    // Инициализируем моки перед каждым тестом
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        String bookId = "123";
        Book expectedBook = new Book("123", "Title", "Author");

        // Настраиваем мок-объект bookRepository, чтобы при вызове метода findById(bookId) он возвращал expectedBook
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        // Вызываем метод findBookById класса BookService
        Book actualBook = bookService.findBookById(bookId);

        // Сравниваем ожидаемый результат (expectedBook) с фактическим результатом (actualBook)
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Title 1", "Author 1"),
                new Book("2", "Title 2", "Author 2"),
                new Book("3", "Title 3", "Author 3")
        );

        // Настраиваем мок-объект bookRepository, чтобы при вызове метода findAll() он возвращал expectedBooks
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызываем метод findAllBooks класса BookService
        List<Book> actualBooks = bookService.findAllBooks();

        // Сравниваем ожидаемый результат (expectedBooks) с фактическим результатом (actualBooks)
        assertEquals(expectedBooks, actualBooks);
    }
}
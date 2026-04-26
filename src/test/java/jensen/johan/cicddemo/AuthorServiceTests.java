package jensen.johan.cicddemo;

import jensen.johan.cicddemo.model.Author;
import jensen.johan.cicddemo.repository.AuthorRepository;
import jensen.johan.cicddemo.service.AuthorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test") // test för att application-test.properties
public class AuthorServiceTests {
    @Autowired
    AuthorService authorService;
    @Autowired
    AuthorRepository authorRepository;

    Author author;
    @BeforeEach
    public void setup(){
        author = new Author("Johan", "Nihlén", "johan.nihlen@mail.se");
        authorService.save(author);
    }

    @Test
    public void canFindAllAuthors(){
        List<Author> authors = authorService.findAll();

        assertNotNull(authors);
        assertEquals(1, authors.size());
    }
}

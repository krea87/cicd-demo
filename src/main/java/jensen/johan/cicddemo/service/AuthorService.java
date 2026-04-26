package jensen.johan.cicddemo.service;

import jensen.johan.cicddemo.model.Author;
import jensen.johan.cicddemo.repository.AuthorRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AuthorService {
    private final AuthorRepository authorRepository;

    public void save(Author author){ authorRepository.save(author); }

    public List<Author> findAll(){ return authorRepository.findAll(); }
}

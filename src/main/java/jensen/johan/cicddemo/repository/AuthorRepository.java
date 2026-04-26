package jensen.johan.cicddemo.repository;

import jensen.johan.cicddemo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}

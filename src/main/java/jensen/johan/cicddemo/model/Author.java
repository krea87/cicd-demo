package jensen.johan.cicddemo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255, name = "first_name")
    private String firstName;

    @Column(nullable = false, length = 255, name = "last_name")
    private String lastName;

    @Column(nullable = false, length = 255, name = "email", unique = true)
    private String email;

    public Author(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}

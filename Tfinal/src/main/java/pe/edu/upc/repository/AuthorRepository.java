package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}

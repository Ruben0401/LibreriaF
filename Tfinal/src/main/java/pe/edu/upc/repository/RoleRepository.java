package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}

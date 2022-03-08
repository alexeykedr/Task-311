package ru.alexeykedr.springboot.DAO;

import ru.alexeykedr.springboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleDAO extends JpaRepository<Role, Long> {
}
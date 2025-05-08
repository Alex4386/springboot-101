package gcu.jpa.userdemo.repository;

import gcu.jpa.userdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package loginapp.domain.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import loginapp.domain.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}
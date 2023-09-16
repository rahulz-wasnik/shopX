package org.sx.user.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.sx.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
}

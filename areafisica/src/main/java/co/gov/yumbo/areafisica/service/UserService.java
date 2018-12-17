package co.gov.yumbo.areafisica.service;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.User;
import co.gov.yumbo.areafisica.modelo.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}

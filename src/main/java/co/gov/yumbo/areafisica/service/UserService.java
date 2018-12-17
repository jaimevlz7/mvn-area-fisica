package co.gov.yumbo.areafisica.service;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.User;
import co.gov.yumbo.areafisica.modelo.UserDto;

public interface UserService {

    User createUser(UserDto user) throws Exception;
    List<User> getAllUsuarios();
    void deleteUsuario(long id);
    void updateUsuario(UserDto usuarioDTO) throws Exception;
    User getUsuarioByUsername(String username);
    User getUsuarioById(Long id);
//    List<UsuarioRolDTO> getAllUsuariosRolDTO();
}

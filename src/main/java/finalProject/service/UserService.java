package finalProject.service;

import finalProject.model.User;

public interface UserService {

    User findUserByEmail(String email);

    void saveUser(User user);


}

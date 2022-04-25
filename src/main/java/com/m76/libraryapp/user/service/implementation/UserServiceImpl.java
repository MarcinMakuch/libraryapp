package com.m76.libraryapp.user.service.implementation;

import com.m76.libraryapp.user.exception.UserNotFoundException;
import com.m76.libraryapp.user.model.User;
import com.m76.libraryapp.user.repository.UserRepository;
import com.m76.libraryapp.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException("User", "Id", id));
    }

    @Override
    public User updateUser(User user, long id) {
        User existingUser = userRepository.findById(id).
                orElseThrow(() ->
                        new UserNotFoundException("User", "Id", id));
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        existingUser.setPESEL(user.getPESEL());
        userRepository.save(existingUser);
        return existingUser;
    }

    @Override
    public void deleteUser(long id) {
        userRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException("User", "Id", id));
        userRepository.deleteById(id);
    }


}

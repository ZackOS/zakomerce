package com.porto.zakomerce.service.user;

import com.porto.zakomerce.dto.UserDto;
import com.porto.zakomerce.model.User;
import com.porto.zakomerce.request.CreateUserRequest;
import com.porto.zakomerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}

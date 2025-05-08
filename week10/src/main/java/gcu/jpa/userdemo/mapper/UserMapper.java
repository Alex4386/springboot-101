package gcu.jpa.userdemo.mapper;

import gcu.jpa.userdemo.dto.UserDto;
import gcu.jpa.userdemo.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDto userDto);
    UserDto toDto(User user);
}

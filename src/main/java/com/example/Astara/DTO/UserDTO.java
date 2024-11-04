package com.example.Astara.DTO;

import com.example.Astara.Entities.Chat;
import com.example.Astara.Entities.Role;
import com.example.Astara.Entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String email;
    private String nameUser;
    private List<Role> rolesUser;
    private List<Chat> chatsUser;

    public UserDTO(User user){
        this.email = user.getEmail();
        this.nameUser = user.getNameUser();
        this.rolesUser = user.getRoleUser();
    }
}

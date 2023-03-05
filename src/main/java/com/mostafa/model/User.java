package com.mostafa.model;

import com.mostafa.config.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.model.User.java: SpringBootPassay-PasswordValidation
 * @CreationDate 3/5/2023 2:45 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userName;
    @ValidPassword
    private String password;
}

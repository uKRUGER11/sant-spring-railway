package me.dio.sant.dto;

import me.dio.sant.domain.model.Account;
import me.dio.sant.domain.model.User;

public class UserDTO {
    private Long id;
    private String name;
    private Account account;

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        account = obj.getAccount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

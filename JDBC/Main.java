package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 40);
        userService.saveUser("Петр", "Петров", (byte) 50);
        userService.saveUser("Федор", "Федоров", (byte) 60);
        userService.saveUser("Антон", "Антонов", (byte) 70);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

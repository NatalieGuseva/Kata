package jm.task.core.hibernate.service;

import jm.task.core.hibernate.dao.UserDao;
import jm.task.core.hibernate.dao.UserDaoHibernateImpl;
import jm.task.core.hibernate.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDaoHibernate = new UserDaoHibernateImpl();


    public void createUsersTable() {
        userDaoHibernate.createUsersTable();

    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);

    }

    public List<User> getAllUsers() {
        List<User> users = userDaoHibernate.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}

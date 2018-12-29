package org.academiadecodigo;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;



public class Login {

    private ControlUser controlUser;


    public Login() {
        controlUser = new ControlUser();
        controlUser.addUser(new User("Natalia", "1111"));
        controlUser.addUser(new User("Joao", "2222"));
        controlUser.addUser(new User("Carol", "3333"));
        controlUser.addUser(new User("Andre", "4444"));

    }


    public void run() {

        Prompt prompt = new Prompt(System.in, System.out);
        StringInputScanner login = new StringInputScanner();
        PasswordInputScanner password = new PasswordInputScanner();


        login.setMessage("UserName: ");
        password.setMessage("Password: ");


        while (true) {

            String name = prompt.getUserInput(login);
            String pass = prompt.getUserInput(password);

            if (controlUser.testUser(name, pass)) {

                System.out.println("Login Successful" + "\n" + "Welcome home, " + name);
                return;
            }
            System.out.println("Login and/or password incorrect");

        }

    }
}

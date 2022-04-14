package pl.filipwlodarczyk.constructors.ex6;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        User user = new User("login", "password", "secret");
        User user2 = new User("login3", "password2");
        User user3 = new User("login2", "password4");
        User user4 = new User("login4", "password");
        User user5 = new User("login5", "password");

        User[] usersInMemory = {user,user2,user3,user4,user5};


        while(!isValid) {
            System.out.println("Your username");
            String username = scanner.nextLine();

            System.out.println("Your password");
            String password = scanner.nextLine();


            for (User userInMemory : usersInMemory) {
                if (userInMemory.authenticateCredentials(username, password)) {
                    System.out.println("Hello " + username);
                    isValid = true;
                }
            }

            if(!isValid){
                System.out.println("Bad credentials");
            }
        }


    }
}

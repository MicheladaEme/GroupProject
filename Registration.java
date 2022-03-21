package com.syntax.groupProjects;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("Yahoo")){
            this.email = email;
        } else{
            System.out.println("Invalid Email");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.length()>7 && !userName.isEmpty()) {
            this.userName = userName;
        } else{
            System.out.println("Username must contain more than 6 characters");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>7 && !password.isEmpty() && password.contains(userName)) {
            this.password = password;
        } else{
            System.out.println("Password must contain more than 6 characters and cannot contain your username");
        }
    }
}

package com.syntax.project2;

public class Task04 {
    public static void main(String[] args) {
        Registration registration =new Registration();
        registration.setEmail("gigi@yahoo.com");
        registration.setUserName("gigi125346");
        registration.setPassword("gigi528gigi125346");

        System.out.println("Email is "+registration.getEmail());
        System.out.println("Username is "+registration.getUserName());
        System.out.println("Password is "+registration.getPassword());

    }
}
class Registration{
   private String email;
   private String userName;
   private String password;

    public void setEmail(String email) {
        if (!email.endsWith("yahoo.com")) {
                System.out.println("This email is not valid");
            }else {
            this.email=email;
        }
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()|| userName.length()<6){
            System.out.println("Valid userName cannot be empty and should be of length larger than 6 characters ");
        }else {
            this.userName=userName;
        }
    }

    public void setPassword(String password) {

        if (password.isEmpty()|| password.length()<6||password.contains(userName)){
            System.out.println("Valid password cannot be empty and should be of length larger than 6 characters" +
                    " valid password cannot contain userName");
        }else {
            this.password=password;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
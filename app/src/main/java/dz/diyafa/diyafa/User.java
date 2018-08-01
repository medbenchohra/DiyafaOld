package dz.diyafa.diyafa;

public class User {
    // form : "username:password"
    private String userName;
    private String password;
    private String email;
    private String country;
    private String region;
    private String phone;


    User() {}

    public User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }



}

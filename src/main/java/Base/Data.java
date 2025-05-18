package Base;

public class Data {
    public String username = "senanur";
    public String password = "senasena";
    public String wrongPassword = "wrongpass";
    public String notExistUsername = "senanur" + System.currentTimeMillis();
    public String uniqueUsername = "senanur" + System.currentTimeMillis();
    public String welcomeTextMsg = "Welcome " + username ;
    public String wrongPassMsg = "Wrong password.";
    public String notExistUserMsg = "User does not exist.";
    public String signInSuccessfulMsg = "Sign up successful.";
    public String existUsernameMsg = "This user already exist.";


}

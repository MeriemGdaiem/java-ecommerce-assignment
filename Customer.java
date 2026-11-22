// inherits from user class but adds an email and mobile number
public class Customer extends User {
    private String userEmail;
    private String userMobile;

  
    public Customer(String userId, String userName, String userPassword, String userRegisterTime, String userRole, String userEmail, String userMobile) {
        super(userId, userName, userPassword, userRegisterTime, userRole);
        this.userEmail = userEmail;
        this.userMobile = userMobile;
    }

   
    public Customer() {
        super();
        this.userEmail = "default@gmail.com";
        this.userMobile = "0400000000";
    }

   
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public String getUserMobile() { return userMobile; }
    public void setUserMobile(String userMobile) { this.userMobile = userMobile; }

   
    @Override
    public String toString() {
      
        String userPart = super.toString();
        userPart = userPart.substring(0, userPart.length() - 1);
        
        return userPart + ", \"user_email\":\"" + userEmail + "\", \"user_mobile\":\"" + userMobile + "\"}";
    }
}
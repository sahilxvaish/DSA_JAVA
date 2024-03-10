package banks;

class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters
    //getters
    public String getPassword(){
        return this.password;
    }
    //setters
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank{
    public static void main(String[] args) {

        Account account1 = new Account ();
        account1.name = "Sahil Vaish";
        account1.email = "sahil@gmail.com";
        account1.setPassword ("abcd");       //setters
        System.out.println(account1.getPassword());  //getters
    }
}

//Encapsulation in java
// encapsulation helps in data hiding in java.
//Abstraction
// to show only useful things to the user.
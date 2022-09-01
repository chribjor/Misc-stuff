package cs.bjoremo.christine.miscstuff;

public class User extends TextUI{

    private String username;
    private int age;

    public User(String username, int age){
        this.username = username;
        this.age = age;
    }

    public void setName(String username){
        this.username = username;
    }

    public String getName(){
        return this.username;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}

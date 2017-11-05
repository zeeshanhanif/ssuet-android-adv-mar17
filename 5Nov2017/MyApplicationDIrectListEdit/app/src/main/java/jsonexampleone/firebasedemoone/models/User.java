package jsonexampleone.firebasedemoone.models;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class User {
    String name;
    String id;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

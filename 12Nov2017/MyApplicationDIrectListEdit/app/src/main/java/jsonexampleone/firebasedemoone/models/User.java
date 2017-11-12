package jsonexampleone.firebasedemoone.models;

import java.io.Serializable;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class User implements Serializable{
    String name;
    String id;
    String image;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

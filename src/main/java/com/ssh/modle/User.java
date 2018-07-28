package com.ssh.modle;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id()
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    private String username;
    private String password;
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public User(int userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public User() {
    }


}

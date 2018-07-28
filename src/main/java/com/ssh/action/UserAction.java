package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.modle.User;
import com.ssh.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller(value = "userAction")
@Scope(value = "prototype")
public class UserAction extends ActionSupport {
    @Autowired
    private UserServiceImp userServiceImp;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserServiceImp getUserServiceImp() {
        return userServiceImp;
    }

    public void setUserServiceImp(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @Override
    public String execute() throws Exception {
//        System.out.println(user.getUsername());
//        boolean r=userServiceImp.login(user.getUsername(),user.getPassword());
//        if (r==true)//scott是用户名，tiger是密码
//            return "success";
//        else
            return "error";
    }
    public String addTest(){
        System.out.println("调用了action的addTest方法");
        //userServiceImp.add();
        //userServiceImp.addUser(new User(3, "cc", "cc"));
        userServiceImp.selectUser(2);
        //System.out.println(userServiceImp.login("aa","aa"));
        return NONE;
    }
    public String login(){
        boolean r=userServiceImp.login(user.getUsername(),user.getPassword());
        if (r==true){
            Map session=ActionContext.getContext().getSession();
            session.put("LoginName",user.getUsername());
            return "success";
        }
        else{

            return "error";
        }
    }
    public String register(){
        System.out.println(user.getUsername());
        boolean r=userServiceImp.addUser(user);
        if (r==true)//scott是用户名，tiger是密码
            return "success";
        else
            return "error";
    }
    public String update(){
        System.out.println(user.getUsername());
        boolean r=userServiceImp.updateUser(user);
        if (r==true)//scott是用户名，tiger是密码
            return "success";
        else
            return "error";
    }
}

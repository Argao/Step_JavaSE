package MODEL;

import SERVICES.Get;

public class User {
    private int userid;
    private String fullName, userName, pass;

    public User() {
    }

    public User(int userid, String fullName, String userName, String pass) {
        this.userid = userid;
        this.fullName = fullName;
        this.userName = userName;
        this.pass = pass;
    }
    public User(Boolean montar){
        if(montar){
            System.out.print("Nome de usuário: ");
            this.userName = Get.texto();

            System.out.print("Senha: ");
            this.pass = Get.texto();

            System.out.print("Nome Completo: ");
            this.fullName = Get.texto();
        }
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

/*
create TABLE users(
    user_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username varchar(50) NOT NULL,
    pass varchar(50) NOT NULL,
    fullname varchar(100) NOT NULL
    );
 */

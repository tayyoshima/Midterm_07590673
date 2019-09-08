package com.example.midterm07590673.NewModel;

public class Auth {
    private static final String EMAIL1 = "aaa";
    private static final String PASSWORD1 = "111";
    private static final String EMAIL2 = "bbb";
    private static final String PASSWORD2 = "222";

    private String mEmail;
    private String mPassword;

    public Auth(String mEmail , String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }

    public int check(){
        if(mEmail.equals(EMAIL1) && mPassword.equals(PASSWORD1)){
            return 1;
        }
        else if (mEmail.equals(EMAIL2) && mPassword.equals(PASSWORD2)){
            return 2;
        }else{
            return 0;
        }
    }
}

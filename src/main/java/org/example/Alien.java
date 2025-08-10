package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    int age;

    Computer com;

    public Alien(){}



//     @ConstructorProperties({"age","lap"})
    public Alien(int age , Computer com){
        this.age=age;
        this.com=com;
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getcode(){
    com.getcompile();

    }


}


package com.company.interfaces;

public class Person implements Comparable<Person> {

    private String firstName;
    private String LastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o){

        if(this.age > ((Person)o).age){

            return 1;
        }
        else if(this.age < ((Person)o).age){

            return -1;
        }
        else{

            return 0;
        }
    }
}

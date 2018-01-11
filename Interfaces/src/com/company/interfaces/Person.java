package com.company.interfaces;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(){

        this.age = 0;
    }

    public Person(String firstName, String lastName) throws Exception{

        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(String firstName, String lastName, int age) throws Exception{

        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception{

        if(isNameValid(firstName.trim())){

            this.firstName = firstName.trim();
        }
        else{

            throw new Exception("Name must be at least 2 chars long!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception{

        if(isNameValid(lastName.trim())){

            this.lastName = lastName.trim();
        }
        else{

            throw new Exception("Name must be at least 2 chars long!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws  Exception {

        if(age >= 0){
            this.age = age;
        }
        else{

            throw new Exception("Age must be greater or equal to zero!");
        }
    }

    private boolean isNameValid(String name){

        if(name.length() >= 2){

            return true;
        }
        else{

            return false;
        }
    }

    @Override
    public int compareTo(Person o){

        if(this.age > o.age){

            return 1;
        }
        else if(this.age < o.age){

            return -1;
        }
        else{

            return 0;
        }
    }
}

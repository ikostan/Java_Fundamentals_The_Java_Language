package com.company.interfaces;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(){

        this.age = 0;
    }

    public Person(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) throws Exception{

        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

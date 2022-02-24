package com.company;

public class Person implements Exceotoinjdsh {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

        if (this.age <= 0) {
            try {
                Exception();
            }catch (Exception e){
                System.out.println("Nol je noldon kichine san bolboit!");
            }
            try {
                System.out.println(98 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Nol je noldon kichine san bolboit!");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (this.age <= 0) {
//            System.out.println(98/0);
            try {
                System.out.println(98/0);
            } catch (ArithmeticException e) {
                System.out.println("Nol je noldon kichine san bolboit!");
            }
        }
    }
    public void Exception1(){

    }

    @Override
    public void Exception() throws Exception {
        Exception Exception = new Exception();
        throw Exception;
    }
}

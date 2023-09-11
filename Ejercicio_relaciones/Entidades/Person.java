package Entidades;


import java.util.List;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int idCard;
    private Dog adoptedPets;

    public Person(String name, String surname, int age, int idCard, Dog adoptedPets) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.idCard = idCard;
        this.adoptedPets = adoptedPets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public Dog getAdoptedPets() {
        return adoptedPets;
    }

    public void setAdoptedPets(Dog adoptedPets) {
        this.adoptedPets = adoptedPets;
    }

    
    
//    @Override
//    public String toString() {
//        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", idCard=" + idCard + ", dog=" + dog + '}';
//    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", idCard=" + idCard + ", adoptedPets=" + adoptedPets + '}';
    }

}

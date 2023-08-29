package Entidades;


public class Dog {

    private String name;
    private String dogBreed;
    private int age;
    private String size;
    private boolean adoptado;

    public Dog() {
    }

    public Dog(String name, String dogBreed, int age, String size) {
        this.name = name;
        this.dogBreed = dogBreed;
        this.age = age;
        this.size = size;
        this.adoptado = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
 
    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", dogBreed=" + dogBreed + ", age=" + age + ", size=" + size + ", adoptado=" + adoptado  + "}";
    }

}

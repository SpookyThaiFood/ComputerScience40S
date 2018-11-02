/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.advancedclasses;

/**
 *
 * @author t.swaity
 */
public class Person {
    
    private String name;
    private int age; // encapsulated property
    protected boolean isMale;
    
    /**
     * Constructor methods have the same name as the class and have no return type
     */
    public Person() {
        name = "Jeff Moore";
        age = 0;
        isMale = false;
    }
    
    public void talk() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Person " + name + " is " + age + " and masculinity is " + isMale;
    }
    
    @Override
    public boolean equals(Object object) {
        Person person = (Person)object;
        if (this.age != person.age) return false;
        if (this.isMale != person.isMale) return false;
        if (!this.name.equals(person.getName())) return false;
        return true;
    }
    
    @Override
    public Person clone() {
        return new Person(name, age, isMale);
    }
    
    public Person(String name, int age, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
    
    //Accessor
    public String getName() {
        return name;
    }
    
    //Mutator
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public static void endOfTheWorld() {
        System.out.println("People don't think it be like it is, but id do");
    }
    
    public void consume(Food food) {
        if (food.shouldCook()) {
            food.eat();
        } else {
            food.spoil();
        }
        
    }
    
}

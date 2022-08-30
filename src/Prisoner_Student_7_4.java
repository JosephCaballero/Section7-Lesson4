//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner_Student_7_4 {
    public boolean think;
    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public Prisoner_Student_7_4(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        System.out.println("Prisoner " + name + " is " + height + "m tall and has a sentence of " + sentence);
    }
    public Prisoner_Student_7_4(String name, double height, int sentence, boolean think){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.think = think;
        System.out.print("Prisoner " + name + " is " + height + "m tall and has a sentence of " + sentence);
        if (think == true){
            System.out.print(", Prisoner " + name + " thinks " );think();
        }
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }



}

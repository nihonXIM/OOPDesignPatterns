package com.jdpattern.Kproxy.refl;

public class Chicken implements Flyable{
    private String sound = "ggoggodeck";
    private int age = 1;
    private String nurtPlace = "home";

    private int flyingSpeed = 10;

    public void Sound(){
        System.out.println(sound);
    }
    @Override
    public void Fly() {
        String flyBehaviour = "fly fly";
        System.out.println(flyBehaviour);
    }

    @Override
    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public int getFlayingSpeed() {
        return flyingSpeed;
    }


    public Chicken() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNurtPlace() {
        return nurtPlace;
    }

    public void setNurtPlace(String nurtPlace) {
        this.nurtPlace = nurtPlace;
    }



}

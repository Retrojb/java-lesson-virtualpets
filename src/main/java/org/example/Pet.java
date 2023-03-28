package org.example;

public class Pet implements Animal {
     private String name;
     final int smMeal = 5;
     final int lgMeal = 10;
     final int takeDrink = 10;
     final int STARTING_STATS = 70;
     private int hunger = STARTING_STATS;
     private int thirst = STARTING_STATS;
     private int petLifeEnergy = health;
     private int tiredToAwake;
     private boolean isTired;
     private boolean isHungry;
     private boolean isThirsty;
     private int bordemToPlayful;

    public Pet(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getPetLifeEnergy() {
        return petLifeEnergy;
    }
    public int setPetLifeEnergy(int petLifeEnergy) {
        this.petLifeEnergy = petLifeEnergy;
        return petLifeEnergy;
    }

    public int getBordemToPlayful() {
        return bordemToPlayful;
    }

    public void setBordemToPlayful(int bordemToPlayful) {
        this.bordemToPlayful = bordemToPlayful;
    }

    public int getTiredToAwake() {
        return tiredToAwake;
    }

    public void setTiredToAwake(int tiredToAwake) {
        this.tiredToAwake = tiredToAwake;
    }

    public boolean isTired() {
        return isTired;
    }

    public void setTired(boolean tired) {
        isTired = tired;
    }

    public boolean isHungry() {
        if (hunger > 40) {
            System.out.printf("%s is getting mighty hungry", name);
        }
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isThirsty() {
        if( thirst < 40) {
            System.out.printf("%s is thirsty", name);
        }
        return isThirsty;
    }

    public void setThirsty(boolean thirsty) {
        isThirsty = thirsty;
    }

    @Override
    public void eat() {
        setHunger(hunger);
    }

    @Override
    public void drink() {
        thirst += takeDrink;
        setThirst(thirst);
    }

    @Override
    public void sleep() {
        tiredToAwake += 15;
    }

    public void eatLrgMeal() {
         hunger += lgMeal;
         petLifeEnergy += 5;
         setHunger(hunger);
         setPetLifeEnergy(petLifeEnergy);
         if(hunger < 70) {
             System.out.printf("%s is getting full, hunger is: %x%n", name, hunger);
         }
    }

    public void eatSmMeal() {
         hunger += smMeal;
         petLifeEnergy += 3;
         setHunger(hunger);
         setPetLifeEnergy(petLifeEnergy);
    }

    public void playTugOfWar() {
         bordemToPlayful += 15;
         petLifeEnergy -= 10;
         hunger -= 5;
         thirst -=5;
         setHunger(hunger);
         setThirst(thirst);
         setPetLifeEnergy(petLifeEnergy);
         setBordemToPlayful(bordemToPlayful);

    }

    public void playFetch() {
        bordemToPlayful += 10;
        petLifeEnergy -= 7;
        hunger -= 5;
        thirst -=5;
        setHunger(hunger);
        setThirst(thirst);
        setPetLifeEnergy(petLifeEnergy);
        setBordemToPlayful(bordemToPlayful);
    }
}

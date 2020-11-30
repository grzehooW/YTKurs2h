package kursJavaYT;

public class Guest {

    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String imie, String meal, int phoneNumber, boolean isVegan){
        this.name = imie;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getImie() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setImie(String imie) {
        this.name = imie;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public void displayGuestInformation(){
        System.out.println("Imie: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Phone number: " + phoneNumber);
        String isVeganString = isVegan ? "TAK" : "NIE";
        System.out.println("Is Vegan " + isVeganString);
        System.out.println();
    }
}

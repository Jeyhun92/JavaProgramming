package day01_JavaIntro;

public class Pound {

    static Water water;
  public Pound(String color){
        water = new Water(color);
    }
}

class  Water {
    String color;

    public Water(String color) {
        this.color = color;
    }
}
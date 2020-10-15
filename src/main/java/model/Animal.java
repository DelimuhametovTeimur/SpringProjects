package model;

public class Animal {

    private Cat cat;

    public Cat getCat() { return cat; }

    public Animal (Cat cat) {
        this.cat = cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
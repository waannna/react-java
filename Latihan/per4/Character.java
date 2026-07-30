package latihan.per4;


public abstract class Character {
// Atribut atau properti

    private String name;
// Constructor

    public Character(String name) {
        this.name = name;
    }
// Method abstrak

    public abstract void attack();
// Method biasa

    public void survive() {
        System.out.println("Karakter bertahan");
    }
// Method Getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

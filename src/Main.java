//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Monster fireDragon = new Dragon(1000, 100);
        fireDragon.speak();
        Monster pureBloodVampire = new Vampire(1000, 100);
        pureBloodVampire.speak();
    }

}
//1. Maak een main-klasse aan.
public class Main {
//2. Maak binnen de main-klasse een main-methode aan.
public static void main(String[] args) {
    //Create Pokemon objects
    Pikachu pikachu = new Pikachu("Pikachu", 10, 50, "Thunderbolt" );
    Charmander charmander = new Charmander("Charmander", 8, 45, "Flamethrower");
    Balbasaur balbasaur = new Balbasaur("Balbasaur", 7, 40, "Vine Whip");
    Squirtle squirtle = new Squirtle("Squirtle", 9, 42, "Water Gun");

    //Use methods
    pikachu.attack();
    pikachu.defend();
    pikachu.useThunderbolt();
    pikachu.charge();

    charmander.attack();
    charmander.defend();
    charmander.useFlamethrower();
    charmander.growl();

    balbasaur.attack();
    balbasaur.defend();
    balbasaur.useVineWhip();
    balbasaur.synthesize();

    squirtle.attack();
    squirtle.defend();
    squirtle.useWaterGun();
    squirtle.withdraw();
}
}

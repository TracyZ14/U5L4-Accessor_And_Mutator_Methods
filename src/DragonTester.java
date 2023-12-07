public class DragonTester
{
    public static void main(String[] args)
    {
        Dragon dragon = new Dragon();

        System.out.println("EXPECTED RESULT :");
        System.out.println("Dragon:");
        System.out.println("Strength = 1");
        System.out.println("Health = 100");
        System.out.println("Level = 1");
        System.out.println("Dead = false");
        System.out.println("Attack Damage = 0");
        System.out.println("ACTUAL RESULT   :");
        System.out.println(dragon);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon attacks for 1 health points!");
        System.out.print("ACTUAL RESULT   : ");
        int attackAmt = dragon.attack();
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon takes 20 damage and now has 80 health.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.takeDamage(20);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon's health has increased to 160.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.powerUp(1);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon's strength has increased to 2.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.powerUp(2);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon's strength has increased to 4.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.powerUp(2);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon's strength has increased to 8.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.powerUp(2);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon attacks for 8 health points!");
        System.out.print("ACTUAL RESULT   : ");
        int attackAmt2 = dragon.attack();
        System.out.println();

        System.out.println("EXPECTED RESULT :");
        System.out.println("Dragon:");
        System.out.println("Strength = 8");
        System.out.println("Health = 160");
        System.out.println("Level = 1");
        System.out.println("Dead = false");
        System.out.println("Attack Damage = 9");
        System.out.println("ACTUAL RESULT   :");
        System.out.println(dragon);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon takes 70 damage and now has 90 health.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.takeDamage(70);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon's strength has increased to 16.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.powerUp(2);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon attacks for 16 health points!");
        System.out.print("ACTUAL RESULT   : ");
        int attackAmt3 = dragon.attack();
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon's strength has increased to 32.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.powerUp(2);
        System.out.println();

        System.out.println("EXPECTED RESULT :");
        System.out.println("Dragon:");
        System.out.println("Strength = 32");
        System.out.println("Health = 90");
        System.out.println("Level = 1");
        System.out.println("Dead = false");
        System.out.println("Attack Damage = 25");
        System.out.println("ACTUAL RESULT   :");
        System.out.println(dragon);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon attacks for 32 health points!");
        System.out.print("ACTUAL RESULT   : ");
        int attackAmt4 = dragon.attack();
        System.out.println();

        System.out.println("EXPECTED RESULT :");
        System.out.println("Dragon:");
        System.out.println("Strength = 32");
        System.out.println("Health = 90");
        System.out.println("Level = 2");
        System.out.println("Dead = false");
        System.out.println("Attack Damage = 0");
        System.out.println("ACTUAL RESULT   :");
        System.out.println(dragon);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon takes 65 damage and now has 25 health.");
        System.out.print("ACTUAL RESULT   : ");
        dragon.takeDamage(65);
        System.out.println();

        System.out.println("EXPECTED RESULT :");
        System.out.println("The dragon takes 40 damage and now has 0 health.");
        System.out.println("The dragon has been slayed!");
        System.out.println("ACTUAL RESULT   :");
        dragon.takeDamage(40);
        System.out.println();

        System.out.println("EXPECTED RESULT : The dragon is already dead!");
        System.out.print("ACTUAL RESULT   : ");
        dragon.takeDamage(10);
        System.out.println();

        System.out.println("EXPECTED RESULT :");
        System.out.println("Dragon:");
        System.out.println("Strength = 32");
        System.out.println("Health = 0");
        System.out.println("Level = 2");
        System.out.println("Dead = true");
        System.out.println("Attack Damage = 0");
        System.out.println("ACTUAL RESULT   :");
        System.out.println(dragon);
        System.out.println();

        System.out.println("EXPECTED RESULT : 32");
        System.out.println("ACTUAL RESULT   : " + dragon.getStrength());
        System.out.println();

        System.out.println("EXPECTED RESULT : 0");
        System.out.println("ACTUAL RESULT   : " + dragon.getHealth());
        System.out.println();

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + dragon.getLevel());
        System.out.println();

        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + dragon.isDead());
    }
}
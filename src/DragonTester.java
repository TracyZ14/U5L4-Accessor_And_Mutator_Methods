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

        System.out.println("EXPECTED RESULT : ");
        System.out.print("ACTUAL RESULT   : ");
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
    }
}
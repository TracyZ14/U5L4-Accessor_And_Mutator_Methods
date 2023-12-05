public class Dragon
{
    private int health;
    private int strength;
    private int level;
    private boolean dead;
    private int attackDamage;
    private int totalAttackDamage;

    public Dragon()
    {
        this.health = 100;
        this.strength = 1;
        this.level = 1;
        this.dead = false;
        this.attackDamage = 0;
        this.totalAttackDamage = 0;
    }

    public void takeDamage(int damageTaken)
    {
        if(dead)
        {
            System.out.println("The dragon is already dead!");
        }
        else
        {
            health = health - damageTaken;
            if (health <= 0)
            {
                health = 0;
                dead = true;
            }
            System.out.println("The dragon takes " + damageTaken + " damage and now has " + health + " health.");
            if (dead)
            {
                System.out.println("The dragon has been slayed!");
            }
        }
    }

    public int attack()
    {
        int attack = strength * level;
        System.out.println("The dragon attacks for " + attack + " health points!");
        attackDamage = attackDamage + attack;
        totalAttackDamage = totalAttackDamage + attack;
        while(totalAttackDamage >= 50)
        {
            level++;
            totalAttackDamage = totalAttackDamage - 50;
        }
        return attackDamage;
    }

    public void powerUp(int powerUpChoice)
    {
        if(powerUpChoice == 1)
        {
            health = health * 2;
            System.out.println("The dragon's health has increased to " + health + "!");
        }
        if(powerUpChoice == 2)
        {
            strength = strength * 2;
            System.out.println("The dragon's strength has increased to " + strength + "!");
        }
    }

    public int getStrength()
    {
        return strength;
    }

    public int getHealth()
    {
        return health;
    }

    public int getLevel()
    {
        return level;
    }

    public boolean isDead()
    {
        return dead;
    }

    public String toString()
    {
        String dragonStats = "Dragon:\nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level + "\nDead = " + dead + "\nAttack Damage = " + attackDamage;
        return dragonStats;
    }
}
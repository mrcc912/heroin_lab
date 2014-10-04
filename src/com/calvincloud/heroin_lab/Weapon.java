public class Weapon extends Item
{

    public enum WeaponType
    {
        SLASHING,
        BLUDGEONING,
        PIERCING
    }

    public enum ProfiencyType
    {
        SIMPLE,
        MARTIAL,
        EXOTIC
    }


    public Weapon(String name, String description, int weight)
    {
        super(name, description, weight);
    }
}

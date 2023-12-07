public class SwordmanAcc extends accessory{
    SwordmanAcc(String name, String wearingType, String actionType, double stat){
        super(name,wearingType,actionType,stat);
        jobType = "Swordman";
        weight = 0.8;
    }

    /**check that RPG character can wear the current accessory
     * based on the character's strength stat
     * @param RPGcharacter r that attempting to wear the accessory
     * @return true if the character can wear the accessory,false otherwise
     */
    @Override
    boolean wearable(RPGcharacter r){
        return r.strength >=lv+1;
    }
}


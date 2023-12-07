public class AssasinAcc extends accessory {
    AssasinAcc(String name, String wearingType, String actionType, double stat) {
        super(name, wearingType, actionType, stat);
        jobType = "Assasin";
        weight = 0.3;
    }

    /**check that RPG character can wear the current accessory
     * based on the character's maxRunSpeed
     * @param RPGcharacter r that attempting to wear the accessory
     * @return true if the character can wear the accessory,false otherwise
     */
    @Override
    boolean wearable(RPGcharacter r) {
        return r.maxRunSpeed >= lv+1;
    }
}

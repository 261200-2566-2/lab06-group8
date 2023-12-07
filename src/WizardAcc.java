public class WizardAcc extends accessory {
    WizardAcc(String name, String wearingType, String actionType, double stat) {
        super(name, wearingType, actionType, stat);
        jobType = "Wizard";
        weight = 0.5;
    }

    /**check that RPG character can wear the current accessory
     * based on the character's intelligence stat
     * @param RPGcharacter r that attempting to wear the accessory
     * @return true if the character can wear the accessory,false otherwise
     */
    @Override
    boolean wearable(RPGcharacter r) {
        return r.intelligence >= lv+1;
    }
}

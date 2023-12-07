interface accInterface{
    String getName();
    int getLv();
    String getWearingType();
    String getJobtype();
    void getDescription();
    double getDefstat();
    double getDamstat();
    double getWeight();
}
public class accessory implements accInterface{
    protected String wearingType;
    protected String name;
    protected String jobType = "noJobType";
    protected double weight =  0.5;
    protected double damStatBase = 0;
    protected double defStatBase = 0;
    protected int lv=0;
    protected accessory(String name,String wearingType,String actionType,double stat){
        this.name = name;
        this.wearingType = wearingType;
        if(actionType.equals("attack")) damStatBase = stat;
        if(actionType.equals("defend")) defStatBase = stat;
    }
    accessory(String type){
        this("",type,"",0);
    }

    /**Get wearing type of accessory
     * example accessory for head,right hand
     * @return the type of accessory is worn on
     */
    @Override
    public String getWearingType(){
        return wearingType;
    }

    /**Get Job type of character
     * there are assasin,wizard,swordman
     * @return the job type of character ,or "noJobType" if it's not job-specific, as a String
     */
    @Override
    public String getJobtype() {
        return jobType;
    }

    /**Get description of accessory
     * effects : print a detailed description of the accessory ,
     * including name,level,wearing type,job type,weight,defense stat,and damage stat
     */
    @Override
    public void getDescription() {
        System.out.println("/////////////////////////////");
        System.out.println("        Name : "+name);
        System.out.println("          Lv : "+lv);
        System.out.println(" wearingType : "+wearingType);
        System.out.println("     jobType : "+getJobtype());
        System.out.println("      weight : "+weight);
        System.out.println("     defStat : "+getDefstat());
        System.out.println("     damStat : "+getDamstat());
        System.out.println("/////////////////////////////");
    }

    /**Get defense stat of accessory
     * @return the defense stat of the accessory,
     * calculated as its base defense stat multiplied by (1 + 0.05 * level),as a double
     */
    @Override
    public double getDefstat() {
        return defStatBase*(1+0.05*this.lv);
    }

    /**Get damage stat of accessory
     * @return the damage stat of the accessory,
     * calculated as its base damage stat multiplied by (1 + 0.1 * level),as a double
     */
    @Override
    public double getDamstat() {
        return damStatBase*(1+0.1*this.lv);
    }

    /**increase level of accessory by 1 then update stat of character
     * @param RPGcharacter p uses the accessory
     */
    void lvUp(RPGcharacter p){ //character who use
        lv++;
        p.updateStat();//update character's status
    }

    /**Get weight of accessory
     * @return the weight of the accessory as a double.
     */
    @Override
    public double getWeight(){
        return this.weight;
    }

    /**Get name of accessory
     * @return the name of the accessory as a String
     */
    @Override
    public String getName(){
        return name;
    }

    /**Get level of accessory
     * @return  the level of the accessory as an integer
     */
    @Override
    public int getLv(){
        return lv;
    }

    /**check that RPGcharacter can wear the current accessory
     * @param RPGcharacter r that attempting to wear the accessory
     * @return true if  the character can wear the accessory,false otherwise
     */
    boolean wearable(RPGcharacter r){
        return true;
    }
}

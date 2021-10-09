package domain;

public class Broom implements Comparable{
    private String brandName;
    private int maxSpeed;
    private int version;


    public Broom(String brandName, int maxSpeed, int version){
        this.brandName=brandName;
        this.maxSpeed=maxSpeed;
        this.version=version;

    }

    public String getBrandName() {
        return brandName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public int compareTo(Object o) {
        Broom broomCompared = (Broom) o;
        if(maxSpeed > broomCompared.getMaxSpeed()){
            return -1;
        }
        else if(maxSpeed < broomCompared.maxSpeed){
            return 1;
        }
        else {
            if (brandName.compareToIgnoreCase(broomCompared.getBrandName())>0){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}

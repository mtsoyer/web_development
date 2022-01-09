/*
Motheo Maitin 
11 I
Question 1
*/
// 1.1
class Customer {
    private String name, gender, MedAid;
    private int age;
    private double CostOfPurchase;

    // 1.2
    public Customer(String inName, int inAge, String inGender, double inCostOfPurchase, String inMedAid) {
        name = inName;
        age = inAge;
        gender = inGender;
        CostOfPurchase = inCostOfPurchase;
        MedAid = inMedAid;
    }

    // 1.3
    // getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMedAid() {
        return MedAid;
    }

    public int getAge() {
        return age;
    }

    public double getCostOfPurchase() {
        return CostOfPurchase;
    }

    // setters
    public void setName(String inName) {
        name = inName;
    }

    public void setGender(String inGender) {
        gender = inGender;
    }

    public void setAge(int inAge) {
        age = inAge;
    }

    public void setCostOfPurcahse(double inCostOfPurchase) {
        CostOfPurchase = inCostOfPurchase;
    }

    // 1.4
    public void setMedAid(String inMedAid) {
        boolean flag = true;
        for (int j = 0; j < 3; j++) {
            char test = inMedAid.charAt(j);
            if (Character.isLetter(test)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flag) {
            MedAid = inMedAid;
        }

    }

    @Override
    //1.5
    public String toString()
    {
        return getName() + ", " + getAge() + ", " + getGender() + "\n" + 
        "Cost of purchase: " + getCostOfPurchase() + "\n" + 
        "Medical aid number: " + getMedAid() + "\n";
    }

}
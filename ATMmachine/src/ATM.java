public class ATM {

    private int atmID;
    private Address location;

    public ATM() {
    }

    public ATM(int atmID, Address location){
        this.atmID = atmID;
        this.location = location;
    }

    public int getAtmID() {
        return atmID;
    }

    public void setAtmID(int atmID) {
        this.atmID = atmID;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
    //    public boolean authenticateUser(){
//
//    }
}

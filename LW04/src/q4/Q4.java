package Q4;

class Owner {

    private String ownerName;
    private String phoneNo;

    public Owner() {
        ownerName = "Unknown";
        phoneNo = "N/A";
    }

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {

    private Owner owner;

    public Bicycle() {
        owner = new Owner();
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Owner o1 = new Owner("Lahiru", "0712345678");

        Bicycle b1 = new Bicycle(o1);

        System.out.println("Owner Name: "
                + b1.getOwner().getOwnerName());

        System.out.println("Phone Number: "
                + b1.getOwner().getPhoneNo());
    }
}
public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return  (visitor.getAge() >= 18);
    }


}
//
//TobaccoStall implements ISecurity because it has a minimum age of 18
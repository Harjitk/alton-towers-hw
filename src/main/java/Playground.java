public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {

        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() < 15);


    }
}

//
//Playground implements ISecurity because it has a maximum age of 15
//43031072
//Mr KM Mafora

/*This code is all about Subscription in newspaper article where personal imformation like name and address are used to identify if the newspaper
subscriber is following the procedure to get news in a correct way. In the code there are three classes of which others inherit from the super class
(the use of abstract is included to make the code easier to modify).
This is one of the indication that in java older codes can be upgraded by using the inheritance method to link the same data and add new features.*/

//NewspaperSubscription.java(Abstract Class)

public abstract class NewspaperSubscription{
    protected  String name;
    protected String address;
    protected double rate;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public double getRate() {
        return rate;
    }

    //abstract method to set the Subscriber's address
    public abstract void setAddress(String address);
}


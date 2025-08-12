//PhysicalNewspaperSubscription.java(Subclass)
public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    @Override
    public void setAddress(String address) {
        //If the address contains at least one digit, set the subscription rate to R15.
        if(address.matches(".*\\d.*")){
            this.address = address;
            this.rate = 15.0;
        }
        else{
            //Display an error message and set the rate to 0
            System.err.println("Error: Invalid address format. Subscription rate is now set to 0.");
            this.rate = 0.0;
        }
    }
}

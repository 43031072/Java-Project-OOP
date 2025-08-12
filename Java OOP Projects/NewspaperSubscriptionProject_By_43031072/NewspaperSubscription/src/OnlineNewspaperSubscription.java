//OnlineNewspaperSubscription.java(Subclass)
public class OnlineNewspaperSubscription extends NewspaperSubscription{
    @Override
    public void setAddress(String address) {
        //If the address contains an at sign '@', set the subscription rate to R9.
        if(address.contains("@")){
            this.address =address;
            this.rate = 9.0;
        }
        else{
            //Display an error message and set the rate to 0.
            System.err.println("Error: Invalid email address format. Subscription rate is now set to 0.");
            this.rate = 0.0;
        }
    }
}

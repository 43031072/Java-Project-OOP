//DemoSubscriptions.java(Application)
public class DemoSubscriptions {
    public static void main(String[] args)
    {
        //Create instances of both physicalNewspaperSubscription and OnlineNewspaperSubscription

        PhysicalNewspaperSubscription PNSGood = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription ONSGood = new OnlineNewspaperSubscription();
        PhysicalNewspaperSubscription PNSBad = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription ONSBad = new OnlineNewspaperSubscription();

        //Set Data for each Subscription for the code to run smoothly since the user is not required to enter any data at the moment.
        PNSGood.setName("DaBayne");
        PNSGood.setAddress("123 Mafora Avenue");
        display(PNSGood);

        PNSBad.setName("Volcano");
        PNSBad.setAddress("Asus Street");
        display(PNSBad);

        ONSGood.setName("Carter");
        ONSGood.setAddress("DwayneCarter@myMail.com");
        display(ONSGood);

        ONSBad.setName("Dre");
        ONSBad.setAddress("Eminem Street");
        display(ONSBad);

    }
    //Display Subscription details
    public static  void display(NewspaperSubscription n){
        System.out.println("Name: " + n.getName() + " Address: " + n.getAddress() + " Rate: R" + n.getRate());
    }
}

public class Main{
    public static void main(String[] args) {
        
        ClubAurora clubA = new ClubAurora("CZAXX234TGF", "Alfred", "Hitchcock", "Winewood Av., New York City, NY", "August 13, 1987", "Monthly");

        System.out.println("The member " + clubA.getFirstName() + " " + clubA.getLastName() + " has a " + clubA.getMembership() + 
        " membership and must pay a monthly subscription fee of: €" + clubA.getSubscriptionFee(clubA.getMembership()));
        
        // --- TODO

        /* Repeat the above code to create as many objects for different types of member susbcription  
        */
        ClubAurora clubB = new ClubAurora("CZARX234RT3", "Bob", "Steve", "Winewood Av., New York City, NY", "August 13, 1987", "Half yearly");
        System.out.println("The member " + clubB.getFirstName() + " " + clubB.getLastName() + " has a " + clubB.getMembership() +
                    " membership and must pay a monthly subscription fee of: €" + clubB.getSubscriptionFee(clubB.getMembership()));

    }
}





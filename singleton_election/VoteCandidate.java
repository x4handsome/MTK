/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton_election;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class VoteCandidate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User("Châu");
        User user1 = new User("Trâm");
        User user2 = new User("Kim");
        user.vote(Candidate.Joe_Biden);
        user2.vote(Candidate.Donald_Trump);
        user1.vote(Candidate.Joe_Biden);
        user.vote(Candidate.Joe_Biden);
        //user1.vote(Candidate.Quốc_Châu);
        //user1.vote(Candidate.Quốc_Châu);
        System.out.println("Donal Trump:" +Election.CreateInstance().getJoe());
        System.out.println("Joe Biden:" +Election.CreateInstance().getTrum());
        System.out.println("Quốc Châu:" +Election.CreateInstance().GetChauit());
    }
    
}

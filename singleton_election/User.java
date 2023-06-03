/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_election;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    
    public void vote(Candidate candidate){
        Election eclElection = Election.CreateInstance();
        eclElection.Vote(candidate,this);
    }
}

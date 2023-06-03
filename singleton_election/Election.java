/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_election;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Election {
    private static Election instance;
    private int joe=0, trum=0,chauit=0;
    private List<String> list = new ArrayList();
    private Election(){}
    public  static Election CreateInstance(){
        if (instance== null){
            instance = new Election();
        }
        return instance;
    }
    public void Vote(Candidate candidate, User u){
        if(candidate == null)
            return;
        if(list.contains(u.name))
            return;
        if (candidate == Candidate.Donald_Trump)
            joe++;
        if (candidate == Candidate.Joe_Biden)
            trum++;
        if (candidate == Candidate.Quốc_Châu)
            chauit++;
        list.add(u.name);
    }

    public int getJoe() {
        return joe;
    }

    public int getTrum() {
        return trum;
    }
    public int GetChauit() {
        return chauit;
    }

}

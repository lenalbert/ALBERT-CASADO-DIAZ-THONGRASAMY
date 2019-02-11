package com.example.lenal.trombinoscope;

import java.util.ArrayList;

/**
 * Created by lenal on 11/02/2019.
 */

public class PersonneData {
    public static ArrayList<Personne> personneListe = new ArrayList();

    public PersonneData(Personne p){
        personneListe.add(p);
    }
}

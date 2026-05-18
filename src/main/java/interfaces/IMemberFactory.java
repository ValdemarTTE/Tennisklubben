package interfaces;

import model.Member;

//Interface for systemets medlemsfabrikker
// Definerer kontrakten for oprettelse af medlems-objekter efter objektorienterede principper
public interface IMemberFactory {


    //opretter og returnerer et medlems-objekt baseret på de angivende parametre.
    // Den konkrete underklasse (Casual, Competetive eller Passive) bestemmes af implementeringen
    Member createMember(int id, String name, int age, boolean isActive, boolean isCompetitive);
}
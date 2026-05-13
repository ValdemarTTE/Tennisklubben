package util;

import model.CompetitionPlayer;
import model.Member;
import model.TrainingResult;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingService {


    public void SortByName(List<Member> members) {
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void SortByAge(List<Member> members) {

        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    public void sortbyArrearsAmount(List<Member> members){
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return (int) (o1.GetarrearsAmount() - o2.GetarrearsAmount());
            }
        });
    }

    public List<CompetitionPlayer> getBestResults(List<CompetitionPlayer> players, String discipline ){
        Collections.sort(players, new Comparator<CompetitionPlayer>() {
            @Override
            public int compare(CompetitionPlayer o1, CompetitionPlayer o2) {
                return (int) (o2.getBestResults(discipline) - o1.getBestResults(discipline));
            }
        });


        return players.subList(0,Math.min(5,players.size()));

    }







}

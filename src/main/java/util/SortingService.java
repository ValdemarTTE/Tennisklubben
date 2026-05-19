package util;

import model.CompetitiveMember;
import model.Member;
import model.TrainingResult;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingService {


    public static void SortByName(List<Member> members) {
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void SortByAge(List<Member> members) {

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
                return (int) (o1.getArrearsAmount() - o2.getArrearsAmount());
            }
        });
    }

    public List<CompetitiveMember> getBestResults(List<CompetitiveMember> players, String discipline ){
        Collections.sort(players, new Comparator<CompetitiveMember>() {
            @Override
            public int compare(CompetitiveMember o1, CompetitiveMember o2) {
                return (int) (o2.getBestResults(discipline) - o1.getBestResults(discipline));
            }
        });


        return players.subList(0,Math.min(5,players.size()));

    }







}

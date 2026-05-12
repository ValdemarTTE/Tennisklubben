package model;

import java.util.List;

    public class FinansService {
        private static final double JUNIOR_FEE = 800;
        private static final double SENIOR_FEE = 1500;
        private static final double PASSIVE_FEE = 250;
        private static final double SENIOR_DISCOUNT = 0.25;


//Calculates the fee for a single member.

    public double calculateFee(Member member) {
        if (member.getMemberType() == MemberType.PASSIVE) {
            return PASSIVE_FEE;
        } else if (member.GetAge()) <18){
            return JUNIOR_FEE;
        }else if (member.GetAge() > 60) {
            return SENIOR_FEE * (1 - SENIOR_DISCOUNT);
        } else {
            return SENIOR_FEE;
        }
    }

    //Returns a list of members who have not paid sorted by fee.
    public List<Member> getMembersInRestance(List<Member> members) {
        return members.stream()
                .filter(m -> !.ispaid())
                .sorted((a, b) -> Double.compare(calculateFee(b), claculateFee(a)))
                .toList();
    }

    //Returns expected income from members
    public double getTotalExpectedIncome(List<Member> members) {
        double total = 0;
        for (Member member : members) {
            total += calculateFee(member);
        }
        return total;
    }


}

package service;


import interfaces.IMemberFactory;
import model.Member;
import model.ActiveMember;
import model.CompetitionPlayer;
import model.MemberType;

public class MemberFactoryImpl implements IMemberFactory {

    @Override
    public Member createMember(int id, String name, int age, boolean isActive, boolean isCompetitive) {

        if (!isActive) {
            return new Member(id, name, age, arrearsAmount, memberType);
        }
        if  (isCompetitive) {
            return new CompetitionPlayer(id, name, age, isActive, isCompetitive, arrearsAmount, LocalDate, memberType);
        } else {
            return new ActiveMember(memberID, name, age, isActive, isCompetitive, arrearsAmount, memberType);
        }
    }
}

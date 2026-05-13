package service;


import interfaces.IMemberFactory;
import model.Member;
import model.ActiveMember;
import model.CompetitionPlayer;

public class MemberFactoryImpl implements IMemberFactory {

    @Override
    public Member createMember(int id, String name, int age, boolean isActive, boolean isCompetitive) {

        if (!isActive) {
            return new PassiveMember(id, name,age);
        }
        if  (isCompetitive) {
            return new CompetitionPlayer(id, name, age);
        } else {
            return new ActiveMember(id, name, age);
        }
    }
}

package service;


import interfaces.IMemberFactory;
import model.Member;
import model.ActiveMember;
import model.CompetitiveMember;
import model.MemberType;

public class MemberFactoryImpl implements IMemberFactory {

    @Override
    public Member createMember(int id, String name, int age, boolean isActive, boolean isCompetitive) {

        if (!isActive) {
            return new Member(id, name, age, arrearsAmount, MemberType);
        }
        if  (isCompetitive) {
            return new CompetitiveMember(id, name, age, isActive, isCompetitive, arrearsAmount, LocalDate, MemberType);
        } else {
            return new ActiveMember(id, name, age, isActive, isCompetitive, arrearsAmount, MemberType);
        }
    }
}

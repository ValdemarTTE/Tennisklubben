package model;

public class PassiveMember extends Member {
    public PassiveMember(int memberId, String name) {
        super(memberId, name, MemberType.PASSIV);
        System.out.println("PassivMember created:" + name);
    }
    @Override
    public double calculateFee() {
        return 250;
    }
}


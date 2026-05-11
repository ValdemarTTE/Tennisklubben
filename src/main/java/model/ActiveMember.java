package model;

public class ActiveMember extends Member {
    private boolean isCompetitive;

    public ActiveMember(int memberId, String name, int age, MemberType memberType, boolean isCompetitive) {
        super(memberId, name, age, MemberType);
        this.isCompetitive = isCompetitive;
    }

    public boolean isCompetitive() {
        return isCompetitive;
    }

    public void setCompetitive(boolean competitive) {
        isCompetitive = competitive;
    }
}

package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class FinanceService {


    private double arrearsAmount;

    public ArrayList<Member> getDebts() {
        return debts;
    }

    public double getArrearsAmount() {
        return arrearsAmount;
    }

    public int calculatePrice(MemberType memberType) {

            int price = 0;

            if(memberType == MemberType.JUNIOR) {
                price = 800;
            } else if(memberType == MemberType.SENIOR) {
                price = 1500;
            } else if(memberType == MemberType.OVER_SIXTY) {
                price = 1125;
            } else if(memberType == MemberType.PASSIVE) {
                price = 250;
            }

            return price;
        }


}

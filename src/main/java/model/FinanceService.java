package model;

import java.time.LocalDate;

public class FinanceService {

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

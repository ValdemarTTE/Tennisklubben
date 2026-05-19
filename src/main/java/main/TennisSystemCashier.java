package main;

import file.CSVHandler;
import model.Member;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TennisSystemCashier {
    private Scanner sc;
    private Random random = new Random();
    private CSVHandler filehandler = new CSVHandler();
    public ArrayList<Member> memberList = new ArrayList<>();



    public void expectPayment (){
        filehandler.loadMember(memberList);
    }

    public void sortArrearsAmount(){

    }


}

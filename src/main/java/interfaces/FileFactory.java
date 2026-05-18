package interfaces;

import model.Member;
import java.util.ArrayList;

public interface FileFactory {
    ArrayList<Member> readMembers();
    void saveMembers(ArrayList<Member> members);
}

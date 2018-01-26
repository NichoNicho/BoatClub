package service;

import model.Boat;
import model.Member;
import model.WorkShopException;
import view.StartApp;

import java.util.ArrayList;
import java.util.List;

/**
 * this class prepare data for saving in file , use FileService class for doing
 * this
 */
public class CRUDService {

    /**
     * add a member info file and update in memory
     *
     * @param member
     */
    public void addMember(Member member) throws WorkShopException {
        try {
            StartApp.getMembers().add(member);
            FileService.writeMembers(StartApp.getMembers());
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * get Compact List that contains name, member id and number of boats
     *
     * @return
     */
    public List<String> getMembersCompactList() throws WorkShopException {
        List<String> compactList = new ArrayList<String>();
        try {
            for (Member member : StartApp.getMembers()) {
                String compactInfo = "member name : " + member.getName() + ", member id: " + member.getMemberId() + ", number of boats: " + member.getBoats().size();
                compactList.add(compactInfo);
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return compactList;
    }

    /**
     * get Verbose List that contains name, personal number, member id and boats
     * with boat information
     *
     * @return
     */
    public List<String> getMembersVerboseList() throws WorkShopException {
        List<String> verboseList = new ArrayList<String>();
        try {
            for (Member member : StartApp.getMembers()) {
                String verboseInfo = "member name : " + member.getName() + ", personal number: " + member.getPersonalNumber() + ", member id: " + member.getMemberId() + ", boats info: \n";
                for (Boat boat : member.getBoats()) {
                    verboseInfo += "boat id: " + boat.getId() + ", boat size: " + boat.getSize() + ", boat type: " + boat.getType() + "\n";
                }
                verboseList.add(verboseInfo);
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return verboseList;
    }

    /**
     * remove a member from list by its memberId and save changes in both file
     * and memory
     *
     * @param member
     */
    public void deleteMember(Member member) throws WorkShopException {
        try {
            StartApp.getMembers().remove(member);
            List<Boat> boats = member.getBoats();
            for (Boat boat : boats) {
                StartApp.getBoats().remove(boat);
            }
            FileService.writeBoats(StartApp.getBoats());
            FileService.writeMembers(StartApp.getMembers());
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * return a member with input memerId
     *
     * @param memberId
     * @return
     */
    public Member searchMemberByMemberId(Long memberId) throws WorkShopException {
        try {
            for (Member member : StartApp.getMembers()) {
                if (member.getMemberId().equals(memberId)) {
                    return member;
                }
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return null;
    }

    /**
     * return a boat with input id
     *
     * @param id
     * @return
     */
    public Boat searchBoatById(Long id) throws WorkShopException {
        try {
            for (Boat boat : StartApp.getBoats()) {
                if (boat.getId().equals(id)) {
                    return boat;
                }
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return null;
    }

    /**
     * return a member with input personalNumber
     *
     * @param personalNumber
     * @return
     */
    public Member searchMemberByPersonalNumber(Integer personalNumber) throws WorkShopException {
        try {
            for (Member member : StartApp.getMembers()) {
                if (member.getPersonalNumber().equals(personalNumber)) {
                    return member;
                }
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return null;
    }

    /**
     * update a member info
     *
     * @param member
     */
    public void updateMember(Member member) throws WorkShopException {
        try {
            Member beforeChange = searchMemberByMemberId(member.getMemberId());
            deleteMember(beforeChange);
            addMember(member);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * add a boat info file and update in memory
     *
     * @param member
     * @param boat
     */
    public void addBoat(Member member, Boat boat) throws WorkShopException {
        try {
            Member findMember = searchMemberByMemberId(member.getMemberId());
            deleteMember(findMember);
            member.getBoats().add(boat);
            addMember(member);

            boat.setMember(member);
            for (Boat b : member.getBoats()) {
                StartApp.getBoats().add(b);
            }
            FileService.writeBoats(StartApp.getBoats());
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * remove a boat from list by its id and save changes in both file and
     * memory
     *
     * @param boat
     */
    public void deleteBoat(Boat boat) throws WorkShopException {
        try {
            StartApp.getBoats().remove(boat);
            FileService.writeBoats(StartApp.getBoats());

            Member findMember = searchMemberByMemberId(boat.getMember().getMemberId());
            deleteMember(findMember);
            findMember.getBoats().remove(boat);
            addMember(findMember);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }

    }

    /**
     * update a boat info
     *
     * @param boat
     */
    public void updateBoat(Boat boat,Member member) throws WorkShopException {
        try {
            Member beforeMember = boat.getMember();
            beforeMember.getBoats().remove(boat);  
            member.getBoats().remove(boat);
            member.getBoats().add(boat);
            boat.setMember(member);
            FileService.writeBoats(StartApp.getBoats());
            FileService.writeMembers(StartApp.getMembers());
            
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

}

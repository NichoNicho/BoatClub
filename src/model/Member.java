package model;


import view.StartApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Member implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer personalNumber;
    private Long memberId;
    private List<Boat> boats = new ArrayList<Boat>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Integer personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getNewMemberId() {
        return (long) StartApp.getMembers().size()+1;
    }

    public List<Boat> getBoats() {
        return boats;
    }

    public void setBoats(List<Boat> boats) {
        this.boats = boats;
    }
}

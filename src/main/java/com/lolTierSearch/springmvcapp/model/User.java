package com.lolTierSearch.springmvcapp.model;

/**
 * Created by KangSeongGil on 2017. 4. 27..
 */
public class User {
    private int ID;
    private int accountID;
    private String name;
    private int profileIconID;
    private int revisionDate;
    private int level;

    public User(int ID, int accountID, String name, int profileIconID, int revisionDate, int level) {
        this.ID = ID;
        this.accountID = accountID;
        this.name = name;
        this.profileIconID = profileIconID;
        this.revisionDate = revisionDate;
        this.level = level;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconID() {
        return profileIconID;
    }

    public void setProfileIconID(int profileIconID) {
        this.profileIconID = profileIconID;
    }

    public int getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(int revisionDate) {
        this.revisionDate = revisionDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

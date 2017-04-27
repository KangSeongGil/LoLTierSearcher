package com.lolTierSearch.springmvcapp.model;

/**
 * Created by KangSeongGil on 2017. 4. 27..
 */
public class User {
    private long ID;
    private long accountID;
    private String name;
    private long profileIconID;
    private long revisionDate;
    private long level;

    public User(long ID, long accountID, String name, long profileIconID, long revisionDate, long level) {

        this.ID = ID;
        this.accountID = accountID;
        this.name = name;
        this.profileIconID = profileIconID;
        this.revisionDate = revisionDate;
        this.level = level;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProfileIconID() {
        return profileIconID;
    }

    public void setProfileIconID(long profileIconID) {
        this.profileIconID = profileIconID;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }
}

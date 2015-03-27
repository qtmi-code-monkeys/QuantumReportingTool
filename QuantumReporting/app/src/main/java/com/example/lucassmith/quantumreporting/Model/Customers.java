package com.example.lucassmith.quantumreporting.Model;

/**
 * Created by lucassmith on 3/26/2015.
 */
public class Customers {

    private int mId;
    private String mName;
    private String mContactName;
    private String mContactPhoneNumber;
    private String mContactEmail;
    private int mNumberOfMachines;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getContactName() {
        return mContactName;
    }

    public void setContactName(String contactName) {
        mContactName = contactName;
    }

    public String getContactPhoneNumber() {
        return mContactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        mContactPhoneNumber = contactPhoneNumber;
    }

    public String getContactEmail() {
        return mContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        mContactEmail = contactEmail;
    }

    public int getNumberOfMachines() {
        return mNumberOfMachines;
    }

    public void setNumberOfMachines(int numberOfMachines) {
        mNumberOfMachines = numberOfMachines;
    }
}

package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Interest {

    @SerializedName("idInterest")
    @Expose
    private String idInterest;
    @SerializedName("nameInterests")
    @Expose
    private String nameInterests;

    public Interest(String idInterest, String nameInterests) {
        this.idInterest = idInterest;
        this.nameInterests = nameInterests;
    }

    public String getIdInterest() {
        return idInterest;
    }

    public void setIdInterest(String idInterest) {
        this.idInterest = idInterest;
    }

    public String getNameInterests() {
        return nameInterests;
    }

    public void setNameInterests(String nameInterests) {
        this.nameInterests = nameInterests;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "idInterest='" + idInterest + '\'' +
                ", nameInterests='" + nameInterests + '\'' +
                '}';
    }
}
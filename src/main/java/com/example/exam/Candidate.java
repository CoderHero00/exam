package com.example.exam;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @NotNull
    @Size(min=7, message = "more than 7 character")
    private String Name;
    private String Address;
    private long DateOfBirth;

    public Candidate() {
    }

    public long getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.DateOfBirth);
        calendar.add(Calendar.MONTH, 1);

        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);
        return Integer.toString(mDay)+"/"+Integer.toString(mMonth)+"/"+Integer.toString(mYear);
    }
}


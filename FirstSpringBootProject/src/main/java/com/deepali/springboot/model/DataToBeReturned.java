package com.deepali.springboot.model;

// This is data to be returned from a request
// This should be a POJO (standard getters/setters, at least a default constructor
//                        and optionally equals(), hashCode(), toString()  )

import java.util.Objects;

public class DataToBeReturned {
    private String theData;
    private int aNumber;

    public DataToBeReturned() {}

    public DataToBeReturned(String theData, int aNumber) {
        this.theData = theData;
        this.aNumber = aNumber;
    }

    public String getTheData() {
        return theData;
    }

    public void setTheData(String theData) {
        this.theData = theData;
    }

    public int getaNumber() {
        return aNumber;
    }

    public void setaNumber(int aNumber) {
        this.aNumber = aNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataToBeReturned that = (DataToBeReturned) o;
        return aNumber == that.aNumber && Objects.equals(theData, that.theData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theData, aNumber);
    }

    @Override
    public String toString() {
        return "DataToBeReturned{" +
                "theData='" + theData + '\'' +
                ", aNumber=" + aNumber +
                '}';
    }
}

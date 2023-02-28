package com.company.challengezipcode.model;

public class ZipCodeReceived {
    String cep;

    public String getZipCode() {
        return cep;
    }

    public void setZipCode(String zipCode) {
        this.cep = zipCode;
    }

    @Override
    public String toString() {
        return "zipCodeReceived{" +
                "zipCode='" + cep + '\'' +
                '}';
    }

}

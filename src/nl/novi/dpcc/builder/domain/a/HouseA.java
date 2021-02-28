package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseA {

    //Verplicht
    private Address address;
    private HouseType houseType;

    public HouseA(Address address,HouseType houseType){
        this.address=address;
        this.houseType=houseType;
    }

    public String getStreetName() {
        return address.getStreetName();
    }

    public int getHouseNumber() {
        return address.getHouseNumber();
    }

    public HouseType getHouseType() {
        return houseType;
    }
}

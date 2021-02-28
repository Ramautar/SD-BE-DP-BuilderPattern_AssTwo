package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseABuilder {
    private Address address;
    private HouseType houseType;

    public HouseABuilder(Address address, HouseType houseType){
        this.address= address;
        this.houseType= houseType;
    }

    public HouseABuilder(){
    }

    public HouseABuilder withAddress(Address address){
        this.address= address;
        return this;
    }

    public HouseABuilder withHouseType(HouseType houseType){
        this.houseType= houseType;
        return this;
    }

    public HouseA build(){
        return new HouseA(address, houseType);
    }

    public HouseA buildWithEmptyCheck() {
        if (address == null) {
            throw new RuntimeException("Address object is required");
        }
        if (houseType == null) {
            throw new RuntimeException("House type object is required");
        }
        return new HouseA(address,houseType);
    }
}

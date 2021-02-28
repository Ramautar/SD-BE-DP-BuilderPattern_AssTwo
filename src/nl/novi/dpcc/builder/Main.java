package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;

public class Main {

    public static void main(String[] args) {
	    Address address_Bajnath = new Address(
	            "Oranjetiphof",
                5,
                "3023 BN",
                "Schiedam");

	    HouseType houseType_Bajnath = HouseType.APPARTMENT;

		HouseA woning_Bajnath = new HouseABuilder()
				.withAddress(address_Bajnath)
				.withHouseType(houseType_Bajnath)
				.buildWithEmptyCheck();

		System.out.println(woning_Bajnath.getStreetName() + " " + woning_Bajnath.getHouseNumber());
		System.out.println(woning_Bajnath.getHouseType());
    }
}

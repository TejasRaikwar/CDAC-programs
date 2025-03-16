#include"Address.h";

Address::Address():area(""),city(""),pincode(0){ }//default
Address::Address(string area, string city, int pincode):area(area),city(city), pincode(pincode){}//param const
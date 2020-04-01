package com.company;

public enum Continents {
    Asia("Armenia", "Georgia", "Israel", "Iraq"),
    Africa("Algeria", "Botswana", "Gambia", "Egypt"),
    Europe("Spain", "Italy", "Germany", "Lithuania"),
    SouthAmerica("Argentina", "Bolivia", "Brazil", "Colombia");
    String country, country1,country2,country3;
    Continents(String country, String country1, String country2, String country3){
        this.country = country;
        this.country1 = country1;
        this.country2 = country2;
        this.country3 = country3;
    }

    public String get(){
        return country+" "+country1+" "+country2+" "+country3;
    }

}

package com.example.subarushiozaki.myapplication;

public enum RecipeTitles {
    Miso_shiru("Miso Shiru"),
    Sushi("Sushi"),
    Echizen_ni("Echizen Ni"),
    Atsuyaki_tamago("Atsuyaki Tamago"),
    Kasujiru("Kasujiru"),
    Shiratama_dango("Shiratama Dango"),
    Shiba_duke("Shiba duke"),
    Daigaku_imo("Daigaku imo"),
    Teriyaki_Chicken("Teriyaki Chicken"),
    Chicken_karaage("Chicken Karaage");



    private String name;

    private RecipeTitles(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

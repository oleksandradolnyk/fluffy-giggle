package Homework11_28_11.data;

public class User {

    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    String gender;
    boolean readingLover;
    boolean musicLover;
    boolean sportLover;
    String state;
    String city;


    public User() {

        this.firstName = "Ivan";
        this.lastName = "Shevchenko";
        this.email = "test_email@gmail.com";
        this.phone = "1234567890";
        this.address = "вулиця Мечникова, 14/1, Київ, Україна, 02000";
        this.gender = "Female";
        this.readingLover = true;
        this.sportLover = true;
        this.musicLover = false;
        this.state = "NCR";
        this.city = "Delhi";

    }

    public User(String firstName, String lastName, String email, String phone, String address, String gender, boolean readingLover, boolean musicLover, boolean sportLover, String state, String city) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.readingLover = readingLover;
        this.musicLover = musicLover;
        this.sportLover = sportLover;
        this.state = state;
        this.city = city;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public boolean isReadingLover() {
        return readingLover;
    }

    public boolean isMusicLover() {
        return musicLover;
    }

    public boolean isSportLover() {
        return sportLover;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}

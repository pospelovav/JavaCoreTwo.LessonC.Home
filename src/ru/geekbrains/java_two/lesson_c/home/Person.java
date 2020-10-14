package ru.geekbrains.java_two.lesson_c.home;

public class Person {
    private String surname;
    private String phone;
    private String eMail;

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", phone, eMail);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person per1 = (Person) obj;

        return this.surname.equals(per1.surname);
    }

    public Person(String surname, String phone, String eMail){
        this.surname = surname;
        this.phone = phone;
        this.eMail = eMail;
    }
}

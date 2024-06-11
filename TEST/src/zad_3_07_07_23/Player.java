package zad_3_07_07_23;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Player implements Serializable {
    protected String userName;
    protected String dateOfBirth;

    public Player(String userName, String dateOfBirth) {
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        int age = calculateYearsOfAge();
        if (age==-1){
            System.out.println("wrong date input");
        }
//        System.out.println(age);
    }

    private int calculateYearsOfAge() {
        int age = -1;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy.");
            LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
            LocalDate currentDate = LocalDate.now();
            if ((birthDate != null) && (currentDate != null)) {
                age =  Period.between(birthDate, currentDate).getYears();
            }
        } catch (Exception ignored){
        }
        return age;

    }

    protected abstract void playGamesSince();
    public String getUserName() {
        return userName;
    }
}

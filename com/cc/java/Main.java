package com.cc.java;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Erstelle 5 zufällige Mitarbeiter
        for (int i = 1; i <= 5; i++) {
            Mitarbeiter employee = createRandomEmployee(i);
            System.out.println("Employee " + i + ": " + employee.getName() + " " + employee.getVorname());
            System.out.println(employee.hasLunch());
            System.out.println(employee.startsWork());
            System.out.println(employee.getEmployedTime());
            
            System.out.println();
        }
    }

    // Hilfsmethode zur Erstellung eines zufälligen Mitarbeiters
    private static Mitarbeiter createRandomEmployee(int employeeNumber) {
        Random random = new Random();
        String[] names = {"Jansen", "Schmidt", "Williams", "Watzlawik", "Prattchet", "Davis", "Kilmister", "Crowley", "Connery", "Taylor"};
        String[] firstNames = {"John", "Lemmy", "Paul", "Emily", "Terry", "Emma", "Christopher", "Olivia", "Sean", "Liz"};
        String[] departments = {"Buchhaltung", "Produktion", "Werbung"};
        String[] jobs = {"Accountant", "Manufacturer", "Advertiser"};

        String name = names[random.nextInt(names.length)];
        String firstName = firstNames[random.nextInt(firstNames.length)];
        int birthYear = 1980 + random.nextInt(20);
        String department = departments[random.nextInt(departments.length)];
        String job = jobs[random.nextInt(jobs.length)];

        return new Mitarbeiter(name, firstName, birthYear, employeeNumber, department, job);
    }
}

package com.cc.java;


public class Mitarbeiter {

    private String name;
    private String vorname;
    private int geburtsjahr;
    private int mitarbeiterNummer;
    private String abteilung;
    private String job;

    // Konstruktor
    public Mitarbeiter(String name, String vorname, int geburtsjahr, int mitarbeiterNummer, String abteilung, String job) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsjahr = geburtsjahr;
        this.mitarbeiterNummer = mitarbeiterNummer;
        this.abteilung = abteilung;
        this.job = job;
    }

    // Getter und Setter für die Attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public int getMitarbeiterNummer() {
        return mitarbeiterNummer;
    }

    public void setMitarbeiterNummer(int mitarbeiterNummer) {
        this.mitarbeiterNummer = mitarbeiterNummer;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // Öffentliche Methoden
    public String hasLunch() {
        return "Hi, I'm " + vorname + " " + name + " and I'm having lunch!";
    }

    public String startsWork() {
        return "Hi, I'm " + vorname + " " + name + " and I'm starting my work at the " + abteilung + " department!";
    }

    public String getEmployedTime() {
        return "Hi, I'm " + vorname + " " + name + " and I've been working here for " + (2023 - geburtsjahr) + " years.";
    }

    // Spezifische Methode für Buchhaltung
    public String callsCustomer() {
        if (abteilung.equals("Buchhaltung")) {
            return "Hi, I'm " + vorname + " " + name + " and I'm calling customers!";
        } else {
            return "I don't have this responsibility in my current department.";
        }
    }

    // Spezifische Methode für Produktion
    public String buildCars() {
        if (abteilung.equals("Produktion")) {
            return "Hi, I'm " + vorname + " " + name + " and I'm building cars!";
        } else {
            return "I don't have this responsibility in my current department.";
        }
    }

    // Spezifische Methode für Werbung
    public String advertiseProducts() {
        if (abteilung.equals("Werbung")) {
            return "Hi, I'm " + vorname + " " + name + " and I'm advertising our products!";
        } else {
            return "I don't have this responsibility in my current department.";
        }
    }

    
    }


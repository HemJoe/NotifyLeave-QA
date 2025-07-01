package model;

import java.sql.Date;  // or you can switch to java.time.LocalDate if you prefer

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  // This tells JPA that this is an entity class
public class Employee {

    @Id
    private Long employee_id;

    private String name;
    private String role;
    private String phno;
    private String email;
    private String location;
    private Date dob;  // Can be replaced with LocalDate if you prefer
    private String skills;
    private String personalinfo;
    private String certification;
    private String secondaryskills;

    // Getter and Setter methods for each field
    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getPersonalinfo() {
        return personalinfo;
    }

    public void setPersonalinfo(String personalinfo) {
        this.personalinfo = personalinfo;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getSecondaryskills() {
        return secondaryskills;
    }

    public void setSecondaryskills(String secondaryskills) {
        this.secondaryskills = secondaryskills;
    }

    // Default constructor
    public Employee() {
    }
}

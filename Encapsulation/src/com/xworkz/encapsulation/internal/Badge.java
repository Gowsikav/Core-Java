package com.xworkz.encapsulation.internal;

public class Badge
{
    private String title;
    private String department;
    private int level;
    private boolean active;
    private String issuedBy;

    public Badge() {
        System.out.println("Badge Constructor");
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    public int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    public boolean isActive() {
        return active;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
}

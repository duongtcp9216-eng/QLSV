
package com.phong.studentapp.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ten;
    private int tuoi;
    private double diem;

    public Long getId() { return id; }
    public String getTen() { return ten; }
    public int getTuoi() { return tuoi; }
    public double getDiem() { return diem; }

    public void setId(Long id) { this.id = id; }
    public void setTen(String ten) { this.ten = ten; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiem(double diem) { this.diem = diem; }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "Tbl_Person")//anotasi yang berfungsi merubah nama di table menjadi Tbl_Person bukan PERSON.
public class Person implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)//huruf table disamping bisa dirubah tergantung bagaimana si developer berbincang dengan db admin
    private Long id;
    private String nama;
    private int age;
    @Column(name = "Gaji")//anotasi yang berfungsi merubah nama di field menjadi gaji bukan salary. dan perubahan besar atau gedenya tergantung database
    private double salary;
    private Character gender;
    private Boolean married;
    private Byte theByte;
    private Float bonus;
    @Transient //anotasi yang berfungsi untuk tidak menambahkan coloumn ke dalam table;
    private String specialMessage;
    private BigInteger bulatBesar;
    private BigDecimal desimalBesar;
    @Temporal(TemporalType.DATE)//Anotasi yang berguna untuk memuat format tanggal, harus menggunakan salah satu dari ketiga parameter yang ada.
    private Date birthOfDate;
    private char[] vocal;
    private byte[] image;

    public Person() {
    }

    public Person(Long id, String nama, int age, double salary) {
        this.id = id;
        this.nama = nama;
        this.age = age;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.co.indocyber.model.Person[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the gender
     */
    public Character getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Character gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * @return the theByte
     */
    public Byte getTheByte() {
        return theByte;
    }

    /**
     * @param theByte the theByte to set
     */
    public void setTheByte(Byte theByte) {
        this.theByte = theByte;
    }

    /**
     * @return the bonus
     */
    public Float getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the specialMessage
     */
    public String getSpecialMessage() {
        return specialMessage;
    }

    /**
     * @param specialMessage the specialMessage to set
     */
    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    /**
     * @return the bulatBesar
     */
    public BigInteger getBulatBesar() {
        return bulatBesar;
    }

    /**
     * @param bulatBesar the bulatBesar to set
     */
    public void setBulatBesar(BigInteger bulatBesar) {
        this.bulatBesar = bulatBesar;
    }

    /**
     * @return the desimalBesar
     */
    public BigDecimal getDesimalBesar() {
        return desimalBesar;
    }

    /**
     * @param desimalBesar the desimalBesar to set
     */
    public void setDesimalBesar(BigDecimal desimalBesar) {
        this.desimalBesar = desimalBesar;
    }

    /**
     * @return the birthOfDate
     */
    public Date getBirthOfDate() {
        return birthOfDate;
    }

    /**
     * @param birthOfDate the birthOfDate to set
     */
    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

}

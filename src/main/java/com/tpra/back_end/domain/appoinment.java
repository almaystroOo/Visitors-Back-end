package com.tpra.back_end.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Objects;

enum appoinmenttype {
    personal,
    NORMAL
}
@Entity
@Table(name = "appoinments")
public class appoinment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    @NotBlank
    private String guestname;
    @NotBlank
    @Column
    private LocalDateTime appoinmentdate;
    @NotBlank
    @Column
    private int floor;
    @NotBlank
    @Column
    private int status;
    @NotBlank
    @Column
    private  appoinmenttype type;

    public appoinment(Long id, String guestname, LocalDateTime appoinmentdate, int floor, int status, appoinmenttype type) {
        this.id = id;
        this.guestname = guestname;
        this.appoinmentdate = appoinmentdate;
        this.floor = floor;
        this.status = status;
        this.type = type;
    }

    public appoinment() {

    }

    public Long getId() {
        return id;
    }

    public String getGuestname() {
        return guestname;
    }

    public LocalDateTime getAppoinmentdate() {
        return appoinmentdate;
    }

    public int getFloor() {
        return floor;
    }

    public int getStatus() {
        return status;
    }

    public appoinmenttype getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public void setAppoinmentdate(LocalDateTime appoinmentdate) {
        this.appoinmentdate = appoinmentdate;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setType(appoinmenttype type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        appoinment that = (appoinment) o;

        if (floor != that.floor) return false;
        if (status != that.status) return false;
        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(guestname, that.guestname)) return false;
        if (!Objects.equals(appoinmentdate, that.appoinmentdate))
            return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (guestname != null ? guestname.hashCode() : 0);
        result = 31 * result + (appoinmentdate != null ? appoinmentdate.hashCode() : 0);
        result = 31 * result + floor;
        result = 31 * result + status;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "appoinment{" +
                "id=" + id +
                ", guestname='" + guestname + '\'' +
                ", appoinmentdate=" + appoinmentdate +
                ", floor=" + floor +
                ", status=" + status +
                ", type=" + type +
                '}';
    }

}

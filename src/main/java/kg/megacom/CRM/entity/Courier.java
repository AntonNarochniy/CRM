package kg.megacom.CRM.entity;

import javax.persistence.*;

@Entity(name = "couriers")
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "phone")
    private String phone;
    @Column(name = "couriers_status_id")
    private CouriersStatus couriersStatusId;

    public Courier() {
    }

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", phone='" + phone + '\'' +
                ", couriersStatusId=" + couriersStatusId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CouriersStatus getCouriersStatusId() {
        return couriersStatusId;
    }

    public void setCouriersStatusId(CouriersStatus couriersStatusId) {
        this.couriersStatusId = couriersStatusId;
    }

    public Courier(String fio, String phone, CouriersStatus couriersStatusId) {
        this.fio = fio;
        this.phone = phone;
        this.couriersStatusId = couriersStatusId;
    }
}

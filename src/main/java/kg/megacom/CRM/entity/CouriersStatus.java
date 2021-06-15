package kg.megacom.CRM.entity;

import javax.persistence.*;

@Entity(name = "couriers_statuses")
public class CouriersStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "status")
    private String status;

    public CouriersStatus() {
    }

    public CouriersStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Couriers_status{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

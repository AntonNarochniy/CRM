package kg.megacom.CRM.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity (name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courier_id")
    private Courier courierId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "from_address_id")
    private Address fromAddressId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "to_address_id")
    private Address toAddressId;
    @Column(name = "ransom_sum")
    private int ransomSum;
    @Column(name = "order_date")
    private LocalDate orderDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id")
    private Admin adminId;
    @Column(name = "delivery_price")
    private int deliveryPrice;
    @Column(name = "comment")
    private String comment;

    public Order() {
    }

    public Order(Courier courierId, Address fromAddressId, Address toAddressId, int ransomSum, LocalDate orderDate, Admin adminId, int deliveryPrice, String comment) {
        this.courierId = courierId;
        this.fromAddressId = fromAddressId;
        this.toAddressId = toAddressId;
        this.ransomSum = ransomSum;
        this.orderDate = orderDate;
        this.adminId = adminId;
        this.deliveryPrice = deliveryPrice;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Courier getCourierId() {
        return courierId;
    }

    public void setCourierId(Courier courierId) {
        this.courierId = courierId;
    }

    public Address getFromAddressId() {
        return fromAddressId;
    }

    public void setFromAddressId(Address fromAddressId) {
        this.fromAddressId = fromAddressId;
    }

    public Address getToAddressId() {
        return toAddressId;
    }

    public void setToAddressId(Address toAddressId) {
        this.toAddressId = toAddressId;
    }

    public int getRansomSum() {
        return ransomSum;
    }

    public void setRansomSum(int ransomSum) {
        this.ransomSum = ransomSum;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Admin getAdminId() {
        return adminId;
    }

    public void setAdminId(Admin adminId) {
        this.adminId = adminId;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", courierId=" + courierId +
                ", fromAddressId=" + fromAddressId +
                ", toAddressId=" + toAddressId +
                ", ransomSum=" + ransomSum +
                ", orderDate=" + orderDate +
                ", adminId=" + adminId +
                ", deliveryPrice=" + deliveryPrice +
                ", comment='" + comment + '\'' +
                '}';
    }
}

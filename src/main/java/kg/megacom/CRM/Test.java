package kg.megacom.CRM;

import kg.megacom.CRM.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Admin.class)
                .addAnnotatedClass(CouriersStatus.class)
                .addAnnotatedClass(OrderStatus.class)
                .addAnnotatedClass(Courier.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Order.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();
        try {




            session.beginTransaction();
            Courier courier = session.get(Courier.class, 2);
            Admin admin = session.get(Admin.class, 1);
            Address address = new Address("Улица", "996111111111");
            Address address2 = new Address("Улица2", "99622222222");
            LocalDate date = LocalDate.now();


            Order order = new Order(courier, address, address2, 1000, date, admin, 150, "первый");

            session.save(order);
            session.close();


        }
        finally {
            session.close();
            factory.close();
        }

    }


}

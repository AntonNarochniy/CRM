package kg.megacom.CRM;

import kg.megacom.CRM.entity.Admin;
import kg.megacom.CRM.entity.Courier;
import kg.megacom.CRM.entity.CouriersStatus;
import kg.megacom.CRM.entity.OrderStatus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Admin.class)
                //.addAnnotatedClass(CouriersStatus.class)
                .addAnnotatedClass(OrderStatus.class)
                .addAnnotatedClass(Courier.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {

            CouriersStatus couriersStatus = new CouriersStatus("Уволен");

            Courier courier = new Courier("Петя", "996555505505", couriersStatus);
            session.beginTransaction();
            session.save(couriersStatus);
            session.save(courier);
            session.close();

        }
        finally {
            factory.close();
        }

    }


}

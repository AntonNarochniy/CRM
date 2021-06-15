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
                //.addAnnotatedClass(Admin.class)
                .addAnnotatedClass(CouriersStatus.class)
                //.addAnnotatedClass(OrderStatus.class)
                .addAnnotatedClass(Courier.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {




            session.beginTransaction();
            CouriersStatus couriersStatus = session.get(CouriersStatus.class, 1);
            Courier courier = new Courier("Dfcz", "996555505506", couriersStatus);
            session.save(couriersStatus);
            session.save(courier);
            session.close();

        }
        finally {
            session.close();
            factory.close();
        }

    }


}

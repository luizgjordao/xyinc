package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

public class HibernateConfig {

    @Bean
    public SessionFactory sessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    }
}

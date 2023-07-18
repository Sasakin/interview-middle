package ru.rtech.interview.task7.repository;

import ru.rtech.interview.task7.domain.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    //Logger logger;



    public List<Person> getAdultPersons(){
        List<Person> adultPersons = null;
        try {
            adultPersons = new ArrayList<>();
            Connection c = DriverManager.getConnection("jdbc:hsqldb:mem:test", "admin", "qwerty$4");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM person WHERE sex = 'male' AND age > 18");
            while (rs.next()) {
                Person p = new Person();
                //Retrieve by column name
                p.setId(rs.getLong("id"));
                p.setSex(rs.getString("sex"));
                p.setName(rs.getString("name"));
                p.setAge(rs.getLong("age"));
                p.setWeight(rs.getLong("weight"));
                p.setHeight(rs.getLong("height"));
                adultPersons.add(p);
            }
        } catch (SQLException e) {
            // logger.log(Exception when execution getAuditPersons());
            throw new RuntimeException(e);
        }
        return adultPersons;
    }
}

package ru.rtech.interview.task7.service;

import org.apache.commons.lang3.tuple.Pair;
import ru.rtech.interview.task7.domain.Person;
import ru.rtech.interview.task7.repository.PersonRepository;

import java.util.List;

public class PersonService {

    // Logger loger

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    /**
     * Возвращает средний индекс массы тела всех лиц мужского пола старше 18 лет
     *
     * @return
     */
    public void getAdultMaleUsersAverageBMI() {
        List<Person> adultPersons = repository.getAdultPersons();

        try {
            System.out.println("Average imt - " + calculateAverageBMI(adultPersons));
        } catch (Exception e) {
            // loger.log(CalculationException when execution calculateAverageBMI);
            throw new RuntimeException(e);
        }
    }

    private Double calculateAverageBMI(List<Person> adultPersons) {
        double totalImt = 0.0;
        long countOfPerson = 0;
        double heightInMeters = 0d;
        double imt = 0d;

        for (Person p : adultPersons) {
            heightInMeters = p.getHeight() / 100d;
            imt = p.getWeight() / (Double) (heightInMeters * heightInMeters);
            totalImt += imt;
        }
        countOfPerson = adultPersons.size();

        return totalImt / countOfPerson;

    }



}

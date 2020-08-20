package ru.gosarhro.SRRA_requests.repository.requests;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gosarhro.SRRA_requests.entity.requests.Rubric;

import java.util.List;

@Repository
public interface RubricRepository extends JpaRepository<Rubric, Integer> {
    List<Rubric> findAllByOrderById();
}

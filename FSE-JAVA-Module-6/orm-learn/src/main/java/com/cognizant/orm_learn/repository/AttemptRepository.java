package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AttemptRepository
        extends JpaRepository<Attempt,Integer> {


    @Query("""
SELECT a
FROM Attempt a

JOIN FETCH a.user

JOIN FETCH a.questions aq

JOIN FETCH aq.question q

JOIN FETCH q.options

JOIN FETCH aq.attemptOptions ao

JOIN FETCH ao.option

WHERE a.user.id=:userId
AND a.id=:attemptId
""")
    Attempt getAttempt(
            int userId,
            int attemptId
    );


}

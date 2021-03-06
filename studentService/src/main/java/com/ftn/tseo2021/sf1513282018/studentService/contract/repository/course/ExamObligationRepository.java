package com.ftn.tseo2021.sf1513282018.studentService.contract.repository.course;

import com.ftn.tseo2021.sf1513282018.studentService.model.jpa.course.Course;
import com.ftn.tseo2021.sf1513282018.studentService.model.jpa.course.ExamObligationType;
import com.ftn.tseo2021.sf1513282018.studentService.model.jpa.student.ExamObligationTaking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ftn.tseo2021.sf1513282018.studentService.model.jpa.course.ExamObligation;

import java.util.Set;

@Repository
public interface ExamObligationRepository extends JpaRepository<ExamObligation, Integer> {
    ExamObligation findByExamObligationTaking(ExamObligationTaking examObligationTaking);

    @Query("select eo from ExamObligation eo where " +
            "eo.course.id = :courseId and " +
            "(:description is null or lower(eo.description) like lower(concat('%', :description, '%'))) and " +
            "eo.examObligationType.id = :examObligationTypeId")
    Page<ExamObligation> filterExamObligations(@Param("courseId") Integer courseId, @Param("description") String description,
                                               @Param("examObligationTypeId") Integer examObligationTypeId,
                                               Pageable pageable);
}

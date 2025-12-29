package com.exam.financeadvisor.repo;



import com.exam.financeadvisor.model.Expense;
import com.exam.financeadvisor.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Long> {

    // Custom method: Ek specific user ke saare kharche fetch karne ke liye
    List<Expense> findByUserId(Long userId);
}

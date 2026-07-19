package com.example.AIpowered_Application.Repository;

import com.example.AIpowered_Application.Model.User_Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogsRepository extends JpaRepository<User_Logs, String> {
    boolean existsByoriginalid(String originalid);
}

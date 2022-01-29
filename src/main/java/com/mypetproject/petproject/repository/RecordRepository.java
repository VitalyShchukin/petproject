package com.mypetproject.petproject.repository;

import com.mypetproject.petproject.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}

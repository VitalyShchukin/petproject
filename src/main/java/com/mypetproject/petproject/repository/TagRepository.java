package com.mypetproject.petproject.repository;

import com.mypetproject.petproject.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}

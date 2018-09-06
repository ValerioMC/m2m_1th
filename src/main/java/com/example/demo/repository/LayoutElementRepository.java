package com.example.demo.repository;

import com.example.demo.model.LayoutElement;
import org.springframework.data.jpa.repository.JpaRepository;

interface LayoutElementRepository extends JpaRepository<LayoutElement, Long> {
}

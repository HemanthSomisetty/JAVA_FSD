package com.simplilearn.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.demo.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}

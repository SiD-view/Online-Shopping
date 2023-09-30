package com.online.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.stores.entity.Customer;

public interface UserAdmRepository extends JpaRepository<Customer,Long>
{

}

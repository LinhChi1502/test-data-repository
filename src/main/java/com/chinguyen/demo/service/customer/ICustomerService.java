package com.chinguyen.demo.service.customer;

import com.chinguyen.demo.model.Customer;
import com.chinguyen.demo.model.Province;
import com.chinguyen.demo.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

public interface ICustomerService extends IService<Customer> {
    @Override
    Page<Customer> findAll(Pageable pageable);

    @Override
    Customer findById(Long id);

    @Override
    void save(Customer model);

    @Override
    void remove(Long id);

//    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}

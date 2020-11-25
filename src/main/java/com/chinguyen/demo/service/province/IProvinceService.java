package com.chinguyen.demo.service.province;

import com.chinguyen.demo.model.Province;
import com.chinguyen.demo.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IProvinceService extends IService<Province> {
    @Override
    Page<Province> findAll(Pageable pageable);

    @Override
    Province findById(Long id);

    @Override
    void save(Province model);

    @Override
    void remove(Long id);
}

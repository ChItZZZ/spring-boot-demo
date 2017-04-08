package com.shzhong.service;

import com.shzhong.domain.Girl;
import com.shzhong.enums.ResultEnum;
import com.shzhong.exception.GirlException;
import com.shzhong.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by my on 17/4/8.
 */

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;


    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            //小学
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16) {
            //初中
            throw new GirlException(ResultEnum.MIDDLE_GIRL);
        }

        //如果>16，加钱
        //...



    }
}

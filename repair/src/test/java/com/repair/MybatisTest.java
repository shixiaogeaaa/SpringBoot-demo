package com.repair;

import com.repair.dao.AdministratorMapper;
import com.repair.entity.Administrator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RepairApplication.class)
public class MybatisTest {

    @Autowired
    private AdministratorMapper adminMapper;

    @Test
    public void searchAllAdministrator() {
        List<Administrator> list = adminMapper.selectAll();
        for(Administrator admin : list) {
            System.out.println(admin.getAdminName());
        }
    }
}

package cn.hw.shequ.service;

import cn.hw.shequ.bean.Admin;
import cn.hw.shequ.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminDao dao;

    public Admin findAdmin(String email, String password) {
        return dao.findAdmin(email,password);
    }

    public int updatePass(int id, String newPsw) {
        return dao.updatePass(id,newPsw);
    }
}

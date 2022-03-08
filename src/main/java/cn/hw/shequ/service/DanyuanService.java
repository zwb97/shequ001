package cn.hw.shequ.service;

import cn.hw.shequ.bean.Danyuan;
import cn.hw.shequ.dao.DanyuanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanyuanService {
    @Autowired
    DanyuanDao dao;
    public int getCount() {
        return dao.getCount();
    }

    public List<Danyuan> getAllDanyuans(int page, int limit) {
        return dao.getAllDanyuans(page,limit);
    }

    public int addDanyuan(Danyuan danyuan) {
        return dao.addDanyuan(danyuan);
    }

    public int updateDanyuan(Danyuan danyuan) {
        return dao.updateDanyuan(danyuan);
    }

    public int delDanyuan(int id) {
        return dao.delDanyuan(id);
    }

    public List<Danyuan> findDanyuan(int page, int limit, String name) {
        return dao.findDanyuan(page,limit,name);
    }

    public int getCount(String name) {
        return dao.getCount(name);
    }

    public List<Danyuan> getAllDanyuans() {
        return dao.getAllDanyuans();
    }
}

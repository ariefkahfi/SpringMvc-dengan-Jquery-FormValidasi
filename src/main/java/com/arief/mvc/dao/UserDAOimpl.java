package com.arief.mvc.dao;

import com.arief.mvc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Arief on 9/3/2017.
 */
@Repository
public class UserDAOimpl implements UserDAO {


    @Autowired
    private NamedParameterJdbcTemplate jdbc;


    public void save(User u) {
      Map<String,Object> map = new HashMap<String,Object>();


      map.put("id",u.getId());
      map.put("nama",u.getNama());

      jdbc.update("insert into user values (:id,:nama)",map);
    }

    public List<User> getAll() {
        return jdbc.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
    }

    public User getOne(int id) {
        Map map = new HashMap();
        map.put("id",id) ;

        return jdbc.queryForObject("select * from user where id = :id",map,new BeanPropertyRowMapper<User>(User.class));
    }
}

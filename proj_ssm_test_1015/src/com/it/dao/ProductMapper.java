package com.it.dao;

import com.it.bean.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productMapper")
public interface ProductMapper {
    //增
    @Insert("INSERT INTO product(id,productNum,productName) VALUES(#{id},#{productNum},#{productName})")
    void addProduct(Product product);
    //删
    @Delete("delete from product where id = #{id}")
    void delProduct(Product product);
    //改
    void updProduct(Product product);
    //查
    @Select("select * from product where 1=1")
    List<Product> queryAllProduct(Product product);
}

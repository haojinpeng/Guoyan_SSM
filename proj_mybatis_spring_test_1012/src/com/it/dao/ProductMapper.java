package com.it.dao;

import com.it.bean.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
1 实现添加，
2 删除，
3 修改，
4 按照id查找单个，
5 查询所有，
6 按照productName模糊查询，
7 查询productStatus为1的所有信息
8 查询id在10到20之间的产品信息
9 实现分页，可以查看任意一页内页大小5
 */
@Repository("productMapper")
public interface ProductMapper {
    @Insert("INSERT INTO product(id,productNum) VALUES(#{id},#{productNum})")
    void addProduct(Product product);
    @Delete("DELETE FROM product WHERE id = #{id}")
    void delProduct(Product product);
    //6 按照productName模糊查询，
    @Select("SELECT * FROM product WHERE productName LIKE #{productName}")
    List<Product> queryAllByLike(String productName);
}

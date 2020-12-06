package com.it.dao;

import com.it.bean.Product;
import com.it.bean.Product2;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductMapper {

    //查询所有产品
    @Select("select * from Product")
    List<Product> findAll();

    //字段名不匹配查询所有产品
    @Results(
            value = {
                    @Result(property = "product_Num",column = "productNum"),
                    @Result(property = "product_Name",column = "productName")
            }
    )
    @Select("select * from Product")
    List<Product2> findAll2();

    //模糊查询
    @Select("select * from Product where productName like #{productNames}")
    List<Product> findAllLike(String productName);

    //分页查询  方式一
    /*@Select("select * from Product limit #{param1},#{param2}")
    List<Product> findAllByPage(int startIndex, int pageSize);*/
    //分页查询  方式二
    @Select("select * from Product limit #{startIndex},#{pageSize}")
    List<Product> findAllByPage(@Param("startIndex") int startIndex,@Param("pageSize") int pageSize);

    //通过id查数据
    @Select("select * from Product where id = #{id}")
    Product getProductById(int id);

    //查询条数
    @Select("select count(1) from Product")
    int getCount();

    //插入数据 无返回值
    @Insert("INSERT INTO `shop`.`product`\n" +
            "            (`id`,\n" +
            "             `productNum`,\n" +
            "             `productName`,\n" +
            "             `cityName`,\n" +
            "             `departureTime`,\n" +
            "             `productPrice`,\n" +
            "             `productDesc`,\n" +
            "             `productStatus`)VALUES (#{id},\n" +
            "        #{productNum},\n" +
            "        #{productName},\n" +
            "        #{cityName},\n" +
            "        #{departureTime},\n" +
            "        #{productPrice},\n" +
            "        #{productDesc},\n" +
            "        #{productStatus})")
    void save(Product product);

    //插入数据 无需提供主键
    @Insert("INSERT INTO `shop`.`product`\n" +
            "            ( `productNum`,\n" +
            "             `productName`,\n" +
            "             `cityName`,\n" +
            "             `departureTime`,\n" +
            "             `productPrice`,\n" +
            "             `productDesc`,\n" +
            "             `productStatus`)VALUES (#{productNum},\n" +
            "        #{productName},\n" +
            "        #{cityName},\n" +
            "        #{departureTime},\n" +
            "        #{productPrice},\n" +
            "        #{productDesc},\n" +
            "        #{productStatus})")
    /*
    * @SelctKey(statement="SQL语句",keyProperty="将SQL语句查询结果存放到keyProperty中去",before="true表示先查询再插入，false反之",resultType=int.class)*/
    /*


    * statement是要运行的SQL语句，它的返回值通过resultType来指定
      before表示查询语句statement运行的时机
    keyProperty表示查询结果赋值给代码中的哪个对象，keyColumn表示将查询结果赋值给数据库表中哪一列
    keyProperty和keyColumn都不是必需的，有没有都可以
    before=true，插入之前进行查询，可以将查询结果赋给keyProperty和keyColumn，赋给keyColumn相当于更改数据库
    befaore=false，先插入，再查询，这时只能将结果赋给keyProperty
    赋值给keyProperty用来“读”数据库，赋值给keyColumn用来写数据库
    selectKey的两大作用：1、生成主键；2、获取刚刚插入数据的主键。
    使用selectKey，并且使用MySQL的last_insert_id()函数时，before必为false，也就是说必须先插入然后执行last_insert_id()才能获得刚刚插入数据的ID。*/
    @SelectKey(statement = "select last_insert_id()",
    keyProperty = "id",keyColumn = "id",resultType = long.class,
    before = false)
    void save2(Product product);

    //更新数据
    //jdbcType=数据类型，可省略
    @Update("UPDATE `shop`.`product`\n" +
            "SET \n" +
            "  `productNum` = #{productNum,jdbcType=VARCHAR},\n" +
            "  `productName` = #{productName,jdbcType=VARCHAR},\n" +
            "  `cityName` = #{cityName,jdbcType=VARCHAR},\n" +
            "  `departureTime` = #{departureTime,jdbcType=VARCHAR},\n" +
            "  `productPrice` = #{productPrice,jdbcType=DECIMAL},\n" +
            "  `productDesc` = #{productDesc,jdbcType=VARCHAR},\n" +
            "  `productStatus` = #{productStatus,jdbcType=INTEGER}\n" +
            "WHERE `id` =#{id}")
    void update(Product product);

    //删除数据
    @Delete("delete from Product where id = #{id}")
    void del(long id);
}

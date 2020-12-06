package com.it.bean;
/*
DROP TABLE IF EXISTS `student`;
        CREATE TABLE `student` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `name` varchar(255) NOT NULL,
        `age` int(11) NOT NULL,
        `cid` int(11) NOT NULL,
        PRIMARY KEY (`id`),
        KEY `student_card` (`cid`),
        CONSTRAINT `student_card` FOREIGN KEY (`cid`) REFERENCES `card` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
        ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
        insert  into `student`(`id`,`name`,`age`,`cid`) values (1,'张三',11,1),(2,'李四',12,2),(3,'王五',13,3);
*/
public class Student extends Card{
    private int id;
    private String name;
    private int age;
    private int cid;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return super.toString()+ "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cid=" + cid +
                '}';
    }
}

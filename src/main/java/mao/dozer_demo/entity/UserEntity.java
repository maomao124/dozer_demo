package mao.dozer_demo.entity;

import java.util.Date;

/**
 * Project name(项目名称)：dozer_demo
 * Package(包名): mao.dozer_demo.entity
 * Class(类名): UserEntity
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/28
 * Time(创建时间)： 19:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class UserEntity
{
    /**
     * id
     */
    private String id;
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 地址
     */
    private String address;
    /**
     * 生日
     */
    private Date birthday;


    /**
     * Instantiates a new User entity.
     */
    public UserEntity()
    {

    }

    /**
     * Instantiates a new User entity.
     *
     * @param id       the id
     * @param name     the name
     * @param age      the age
     * @param address  the address
     * @param birthday the birthday
     */
    public UserEntity(String id, String name, int age, String address, Date birthday)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public Date getBirthday()
    {
        return birthday;
    }

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        stringbuilder.append("address：").append(address).append('\n');
        stringbuilder.append("birthday：").append(birthday).append('\n');
        return stringbuilder.toString();
    }
}

